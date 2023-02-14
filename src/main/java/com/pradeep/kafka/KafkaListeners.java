package com.pradeep.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "pradeep",
    groupId = "groupId")
    void listeners(String data){
        System.out.println("Received Data By Listener: "+data+ " !");
    }
}
