package structural.proxy;

public class Main {
    public static void main(String[] args) {
        SMSServiceProxy smsServiceProxy = new SMSServiceProxy();
        System.out.println(smsServiceProxy.sendSMS("1", "0101018", "message1"));
        System.out.println(smsServiceProxy.sendSMS("1", "0101018", "message2"));
        System.out.println(smsServiceProxy.sendSMS("1", "0101018", "message3"));

    }
}
