package com.example.kafka.micro1.service;

import com.example.kafka.micro1.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    public static final String KAFKA_TOPIC = "testj";
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(String name) {
        logger.info("---Sending message -> ");

        Message<User> message = MessageBuilder
                .withPayload(new User(name, "Team member", 27))
                .setHeader(KafkaHeaders.TOPIC, KAFKA_TOPIC)
                .build();

        kafkaTemplate.send(message);
    }
}
