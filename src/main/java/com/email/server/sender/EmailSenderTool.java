package com.email.server.sender;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.email.server.lamaModel.EmailMessage;
import com.email.server.lamaModel.EmailSender;

@Component
public class EmailSenderTool implements EmailSender {

	public void sendEmail(EmailMessage emailMessage) {
		// TODO Actually send email instead of writing about it
		System.out.println("Sending message with subject: "
				+ emailMessage.getSubject());

	}

	public void sendEmail(Date sendingMoment, EmailMessage emailMessage) {
		// TODO Auto-generated method stub

	}

}
