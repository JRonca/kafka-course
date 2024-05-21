package com.jronca.strconsumer.listeners;

import com.jronca.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @StrConsumerCustomListener(groupId = "group-1")
    public void create(String message){
        log.info("0 ::: Receive message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void listener(String message){
        log.info("1 ::: Receive message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-2")
    public void listenerGroup2(String message){
        log.info("2 ::: Receive message {}", message);
    }
}
