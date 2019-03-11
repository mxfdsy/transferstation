package com.stream.transferstation;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 *
 */
@EnableBinding(SendToBinder.class)
public class SendToService {


    @StreamListener("input")
    @SendTo("output")
    public Object receiveFromInput(Object payload){
        System.out.println("中转消息。。"+payload);
        return "xxxxx";
    }

}
