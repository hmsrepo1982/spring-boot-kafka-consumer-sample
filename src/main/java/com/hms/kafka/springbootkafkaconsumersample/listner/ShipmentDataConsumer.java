package com.hms.kafka.springbootkafkaconsumersample.listner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.hms.kafka.springbootkafkaconsumersample.model.Shipment;

@EnableKafka
@Service
public class ShipmentDataConsumer {
	
	@Autowired
	KafkaTemplate<String, Shipment> kafkaTemplate;
	
	private static final String TOPIC = "Harsha_Sample";
	
	@KafkaListener(topics=TOPIC, groupId="StringMessages")
	public void consumeMessage(String pMessage) {
		System.out.println("@@@@@@ Message Consumed @@@@@" + pMessage);
	}

	
}
