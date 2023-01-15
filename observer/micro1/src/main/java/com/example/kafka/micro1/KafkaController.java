package com.example.kafka.micro1;

import com.example.kafka.micro1.service.Producer;
import com.example.kafka.micro1.service.RecruitmentProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @PostMapping(value = "/publish")
    public void sendMessageToKafka(@RequestParam("message") String name) {
        this.producer.sendMessage(name);
    }
}
