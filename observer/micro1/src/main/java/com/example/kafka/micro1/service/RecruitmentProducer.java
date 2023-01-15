package com.example.kafka.micro1.service;

import com.example.kafka.micro1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RecruitmentProducer implements Producer {

    public static final String KAFKA_TOPIC = "testj";
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(String name) {
        log.info("---Sending message -> ");

        Message<User> message = MessageBuilder
                .withPayload(new User(name, "Team member", 27))
                .setHeader(KafkaHeaders.TOPIC, KAFKA_TOPIC)
                .build();

        kafkaTemplate.send(message);
    }
}
