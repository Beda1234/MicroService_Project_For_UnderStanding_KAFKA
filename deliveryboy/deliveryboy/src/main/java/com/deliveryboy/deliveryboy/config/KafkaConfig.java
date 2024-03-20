package com.deliveryboy.deliveryboy.config;

import com.deliveryboy.deliveryboy.constants.Constants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    /**
     * Configuration by the help of NewTopic we can create a new topic in the kafka server
     * TopicBuilder by the help of this we are returning a new topic
     *
     * @return
     */
    @Bean
    public NewTopic newTopic() {
        return TopicBuilder
                .name(Constants.LOCATION_TOPIC_NAME)
//                .replicas() we can give these things but by default it will take some in doc we can check the use of this
//                .partitions()
                .build();
    }
}
