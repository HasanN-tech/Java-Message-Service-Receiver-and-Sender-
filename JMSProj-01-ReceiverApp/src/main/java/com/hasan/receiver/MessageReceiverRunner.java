package com.hasan.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Component
public class MessageReceiverRunner {
	
	@JmsListener(destination = "testmq1")
	public void readMessage(String text) {
		IO.println("Received Message: "+text);
	}
	
}
