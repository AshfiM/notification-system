package my.notification_system.controller;

import my.notification_system.producer.KafkaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    private final KafkaProducerService kafkaProducerService;

    public ProducerController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/addMessage/{msg}")
    public ResponseEntity<String> addMessage(@PathVariable String msg) {
        kafkaProducerService.addMessage(msg);
        return ResponseEntity.ok("sent");
    }
}
