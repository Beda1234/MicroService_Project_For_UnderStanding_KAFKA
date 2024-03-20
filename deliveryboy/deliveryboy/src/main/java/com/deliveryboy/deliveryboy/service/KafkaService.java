package com.deliveryboy.deliveryboy.service;

import com.deliveryboy.deliveryboy.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    /**
     * By The help of this we can send the Kafka messages
     */
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    //    To check message is producing or not we can use logger to see
    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    /**
     * To Produce the data we want kafka template
     *
     * @param location
     * @return
     */
    public boolean updateLocation(String location) {
//         Here we need to send the topic name where we are trying to store the message and the message
        this.kafkaTemplate.send(Constants.LOCATION_TOPIC_NAME, location);
        this.logger.info("message is produced !!");
        return true;
    }
}
