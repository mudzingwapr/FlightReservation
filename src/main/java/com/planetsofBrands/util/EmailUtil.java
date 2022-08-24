package com.planetsofBrands.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {
    @Autowired
	private JavaMailSender sender;
 public void sendItinerary(String toAddress,String filePath) {
	 MimeMessage message= sender.createMimeMessage();
	 try {
		 MimeMessageHelper mesHelp=new MimeMessageHelper(message,true);
		 mesHelp.setTo(toAddress);
		 mesHelp.setSubject("Itenerary for your Booking");
		 mesHelp.setText("Please find your Itinerary attached.");
		 mesHelp.addAttachment("Itenerary", new File(filePath));
	 }catch(MessagingException e) {
		 e.printStackTrace();
	 }
 }
}
