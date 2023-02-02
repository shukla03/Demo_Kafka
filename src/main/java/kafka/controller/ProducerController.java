package kafka.controller;

import entity.HCM;
import kafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/kafka/")
public class ProducerController {

    @Autowired
    KafkaService kafkaProducer;


    @PostMapping(value = "/producer")
    public String sendMessage(@RequestBody HCM h)
    {
        kafkaProducer.publish(h);
        return "Message sent Successfully to the topic";
    }

}

