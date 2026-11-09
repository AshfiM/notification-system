package my.notification_system.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "notify-system", groupId = "notify-group")
    public void consume(String msg){
        log.info("received msg = {}", msg);
    }
}
