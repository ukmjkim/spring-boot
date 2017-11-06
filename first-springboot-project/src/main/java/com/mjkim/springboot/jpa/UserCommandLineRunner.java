package com.mjkim.springboot.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) {
		// save a couple of customers
		repository.save(new User("Tom", "Admin"));
		repository.save(new User("Johny", "User"));
		repository.save(new User("Sandy", "Admin"));
		repository.save(new User("York", "User"));

		log.info("-------------------------------");
		log.info("Finding all users");
		log.info("-------------------------------");
		for (User user : repository.findAll()) {
			log.info(user.toString());
		}

		log.info("-------------------------------");
		log.info("Finding all Admin users");
		log.info("-------------------------------");
		for (User user : repository.findByRole("Admin")) {
			log.info(user.toString());
		}
	}
}
