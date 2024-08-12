package com.example.message_Consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

	@RabbitListener(queues = "demoQueue")
	public void consumeMessage(String message) {
		System.out.println("Message received: " + message);
	}
}
