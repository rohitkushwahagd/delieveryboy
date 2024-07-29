package service;

import config.AppConstants;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaService {

    private KafkaTemplate<String,String> kafkaTemplate;

    public boolean updateLocation(String location){
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
        return true;
    }
}
