package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class SMSServiceProxy{

    // ToDo:  Count Calls for each customer, if calls > 2 Don't send sms.
    private SMSService smsService ;

    private Map<String, Integer> sentCount = new HashMap<>();

//    @Override
    public String sendSMS(String cusID, String mobile, String sms) {
        if(smsService == null){
            smsService = new ConcreteSMSService();
        }

        if (!sentCount.containsKey(cusID)){

            sentCount.put(cusID, 1);
            return smsService.sendSMS(cusID, mobile, sms);
        }else {
            int value = sentCount.get(cusID);
            if (value >= 2) {
                return "Not Sent";
            }else {
                sentCount.put(cusID, value+1);
                return smsService.sendSMS(cusID, mobile, sms);
            }
        }
    }

}
