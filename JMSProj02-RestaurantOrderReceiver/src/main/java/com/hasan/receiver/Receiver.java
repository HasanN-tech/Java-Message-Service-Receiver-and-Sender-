package com.hasan.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.hasan.entity.Order;

@Component
public class Receiver {

	@JmsListener(destination="food-order")
	public void receive(Order o) {
		System.out.println("Received msg: "+o);
	}
}
