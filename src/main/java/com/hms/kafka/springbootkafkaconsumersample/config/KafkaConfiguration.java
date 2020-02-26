package com.hms.kafka.springbootkafkaconsumersample.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;




@Configuration
public class KafkaConfiguration {
	
	@Bean
	public org.springframework.kafka.core.ConsumerFactory<String,String> consumerFactory() {
		
		Map<String, Object> config = new HashMap<>();
		// Config where Zoo keeper is running and where we have our Topic.
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "StringMessage");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		
		return new DefaultKafkaConsumerFactory<>(config);
	}
	
	/**
	 * Kafka Template will be loaded and uses this above config for consumption
	 * @return
	 */
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaConsumerListener() {
		
		ConcurrentKafkaListenerContainerFactory<String, String> kafkaConsumerListener = 
				new ConcurrentKafkaListenerContainerFactory<String, String>();
		kafkaConsumerListener.setConsumerFactory(consumerFactory());	
		
		return kafkaConsumerListener;
		
	}

}
