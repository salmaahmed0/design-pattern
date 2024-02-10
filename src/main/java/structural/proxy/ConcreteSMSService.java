package structural.proxy;

public class ConcreteSMSService implements SMSService {
    @Override
    public String sendSMS(String cusID, String mobile, String sms) {
        return "CustomerId : " + cusID + ", sms sent to: " + mobile;
    }
}
