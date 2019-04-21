package io.github.zhaodj.sample.spi.common;

public class SMSMessageSender implements MessageSender{

    public String getName() {
        return "SMS";
    }

    public boolean send(String message) {
        System.out.println("send sms message: " + message);
        return true;
    }

}
