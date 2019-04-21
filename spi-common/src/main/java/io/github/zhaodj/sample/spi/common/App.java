package io.github.zhaodj.sample.spi.common;

import java.util.ServiceLoader;

public class App {

    public static void main(String[] args) {
        ServiceLoader<MessageSender> serviceLoader = ServiceLoader.load(MessageSender.class);
        for(MessageSender messageSender : serviceLoader){
            System.out.println(messageSender.getName());
            messageSender.send("hello common");
        }
    }

}
