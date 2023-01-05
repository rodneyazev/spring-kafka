package com.spring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.Producer;

@RestController
@RequestMapping("/")
public class KafkaController {
	
	@Autowired
	Producer producer;
	
	@PostMapping("/post")
	public void sendMessage(@RequestBody String message) {
		producer.publishTopic(message);
	}
	
}
