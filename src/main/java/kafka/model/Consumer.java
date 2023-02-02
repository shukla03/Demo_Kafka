package kafka.model;

import entity.HCM;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class Consumer {
    @KafkaListener(topics = "test")
    public void processMessage(HCM h) {
        System.out.println("Message received by consumer 1: " + h);
    }
}