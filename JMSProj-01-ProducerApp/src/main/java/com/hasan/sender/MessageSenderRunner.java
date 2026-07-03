package com.hasan.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
@Component
public class MessageSenderRunner implements CommandLineRunner {

	@Autowired
	private JmsTemplate temp;
	
	@Override
	public void run(String... args) throws Exception {
		temp.send("testmq1",ses->ses.createTextMessage("From sender class at:"+new Date()));
		IO.println("Message sent successfully.");
	}

}
