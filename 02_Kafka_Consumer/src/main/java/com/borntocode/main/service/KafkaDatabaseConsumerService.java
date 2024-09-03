package com.borntocode.main.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.borntocode.main.repository.WikimediaDataRepository;

@Service
public class KafkaDatabaseConsumerService {
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumerService.class);

	private WikimediaDataRepository repository;

	public KafkaDatabaseConsumerService(WikimediaDataRepository repository) {
		super();
		this.repository = repository;
	}

	@KafkaListener(topics = "wikimedia_recentchange_topic", groupId = "myConsumerGroup")
	public void consume(String eventMessage) {
		LOGGER.info("Event message received -> " + eventMessage);
		repository.addNewRow(eventMessage);
	}
}
