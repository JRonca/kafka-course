package com.jronca.strproducer.services;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public StringProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send("str-topic", message).addCallback(
                success -> {
                    if(success != null) {
                        log.info("Send Message with success {}", message);
                        log.info("Partition {}, Offset {}",
                                success.getRecordMetadata().partition(),
                                success.getRecordMetadata().offset()
                        );
                    }
                },
                error -> log.error("Error send message")
        );
    }
}
