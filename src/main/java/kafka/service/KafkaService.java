package kafka.service;

import entity.HCM;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    // Annotation required to listen
    // the message from Kafka server
    @KafkaListener(topics = "RequestBody",
            groupId = "id", containerFactory
            = "empListner")
    public void
    publish(HCM h) {
        System.out.println("New Entry: "
                + h);
    }
}