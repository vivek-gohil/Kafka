package com.borntocode.main.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

	@Bean
	NewTopic getTopic() {
		return TopicBuilder.name("wikimedia_recentchange_topic").build();
	}

}
