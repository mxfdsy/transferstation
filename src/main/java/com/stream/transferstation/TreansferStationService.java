package com.stream.transferstation;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.ServiceActivator;

//@EnableBinding(Processor.class)
public class TreansferStationService {

//    @ServiceActivator(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
    public Object transform(Object payload) {
        System.out.println("消息中转站：" + payload);
        return payload;
    }

}
