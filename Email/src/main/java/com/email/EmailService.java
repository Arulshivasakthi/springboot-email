package com.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailSender;
	
	public void message(String toEmail, String subject, String body) {
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setFrom("gopin469@gmail.com");
		msg.setTo(toEmail);
		msg.setText(body);
		msg.setSubject(subject);
		mailSender.send(msg);
		System.out.println("Mail send successfully");
	
	}

}
