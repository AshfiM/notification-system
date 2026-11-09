package my.notification_system.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private final KafkaTemplate<String, String> template;

    public KafkaProducerService(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    public void addMessage(String msg) {
        template.send("notify-system", msg);
    }
}
