package com.learning.kafka.service;

import com.learning.kafka.constant.ApplicationConstant;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    private static final Logger logger = LoggerFactory.getLogger( KafkaProducerService.class );

    private final KafkaTemplate<String,String > kafkaTemplate;

    public void sendMessage( String message ){
        logger.info( String.format( "Message Send -> %s", message ) );
        this.kafkaTemplate.send( ApplicationConstant.TOPIC_NAME, message );
    }

}
