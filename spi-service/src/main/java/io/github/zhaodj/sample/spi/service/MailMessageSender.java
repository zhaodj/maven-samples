package io.github.zhaodj.sample.spi.service;

import io.github.zhaodj.sample.spi.common.MessageSender;

public class MailMessageSender implements MessageSender {

    @Override
    public String getName() {
        return "Mail";
    }

    @Override
    public boolean send(String message) {
        System.out.println("send mail: " + message);
        return true;
    }

}
