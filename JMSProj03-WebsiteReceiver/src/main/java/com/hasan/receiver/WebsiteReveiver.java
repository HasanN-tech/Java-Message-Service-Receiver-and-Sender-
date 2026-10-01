package com.hasan.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class WebsiteReveiver {

	@JmsListener(destination = "score-topic")
	public void receive(String msg) {

		System.out.println("Website : " + msg);
	}
}
