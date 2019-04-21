package io.github.zhaodj.sample.spi.common;

public interface MessageSender {

    String getName();

    boolean send(String message);

}
