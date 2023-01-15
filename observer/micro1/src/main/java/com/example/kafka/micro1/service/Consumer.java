//package com.example.kafka.micro1.service;
//
//import com.example.kafka.micro1.model.User;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.messaging.MessageHeaders;
//import org.springframework.messaging.handler.annotation.Headers;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.stereotype.Service;
//
//import static com.example.kafka.micro1.service.Producer.KAFKA_TOPIC;
//
//@Service
//public class Consumer {
//    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
//
//    @KafkaListener(topics = KAFKA_TOPIC, groupId = "group_id")
//    public void consume(@Payload User user,
//                        @Headers MessageHeaders headers) {
//        logger.info("receiving data = '{}'", user);
//        headers.keySet().forEach(key -> {
//            logger.info("{}: {}", key, headers.get(key));
//        });
//    }
//}
