package com.user.config;

import com.user.constants.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    /**
     * KafkaListener is for collect the data from the kafka topic or the producer
     *
     * @param value
     */
    @KafkaListener(topics = Constants.LOCATION_TOPIC_NAME, groupId = Constants.GROUP_ID)
    public void updateLocation(String value) {
//        This is the data we are getting from the kafka topic we can save this data into the database
        System.out.println(value);
    }
}
