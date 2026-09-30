package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.hasan.entity.Order;

@Component
public class SenderRunner implements CommandLineRunner {

	@Autowired
	private JmsTemplate template;

	@Override
	public void run(String... args) throws Exception {

		template.convertAndSend("food-order", new Order(101, "Biryani", 2));
		template.convertAndSend("food-order", new Order(102, "Shawarma", 1));
		template.convertAndSend("food-order", new Order(103, "Pizza", 3));
		
		System.out.println(3+" orders are delivered.");
	}

}
