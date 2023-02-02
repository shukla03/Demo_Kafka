import entity.HCM;
import kafka.model.AppConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class KafaJSONMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafaJSONMessageApplication.class, args);
    }

    @KafkaListener(topics = AppConstants.TOPIC, groupId=AppConstants.GROUP_ID)
    public void listen(HCM h) {

        System.out.println("Received info--> : " +h);
    }
}