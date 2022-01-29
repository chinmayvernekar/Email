package com.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendSimpleEmail(String toEmail,String body,String subject) {
		
		SimpleMailMessage mailmessage = new SimpleMailMessage();
		
		mailmessage.setFrom("chinmay.vernekar49@gmail.com");
		mailmessage.setTo(toEmail);
		mailmessage.setText(body);
		mailmessage.setSubject(subject);
		mailSender.send(mailmessage);
		
		System.out.println("Mail Sent................................");
	}
}
