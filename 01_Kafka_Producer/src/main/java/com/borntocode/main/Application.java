package com.borntocode.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.borntocode.main.service.WikimediaChangesProducerService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Autowired
	private WikimediaChangesProducerService changesProducerService;

	@Override
	public void run(String... args) throws Exception {
		changesProducerService.sendMessage();
	}

}
