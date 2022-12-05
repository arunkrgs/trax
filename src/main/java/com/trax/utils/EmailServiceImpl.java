package com.trax.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

//This is component of spring boot
//This class maintenance given to spring boot.
@Component		
public class EmailServiceImpl implements EmailService {

	   	@Autowired
	    private JavaMailSender emailSender;

	    public void sendSimpleMessage(
	      String to, String subject, String text) {
	     
	        SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setTo(to); 
	        message.setSubject(subject); 
	        message.setText(text);
	        emailSender.send(message);
	       
	    }

}
