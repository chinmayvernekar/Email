package com.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.email.model.Email;
import com.email.service.EmailService;

@RestController
@RequestMapping(value = "/send")
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@RequestMapping(value = "/email",method = RequestMethod.POST)
	public String sendEmail(@RequestBody Email email) {
		
		emailService.sendSimpleEmail(email.getTo(), email.getBody(), email.getSub());
		
		return "Mail Sent!!!,Check Email";
	}

}
