package com.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailApplication {
	@Autowired
	private EmailService mailService;

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}@EventListener(ApplicationReadyEvent.class)
	public void send() {
		mailService.message("gopin469@gmail.com", "This is body","this is subject");
		
	}

}
 