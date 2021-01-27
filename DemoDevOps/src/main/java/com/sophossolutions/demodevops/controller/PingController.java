package com.sophossolutions.demodevops.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RestController
@CrossOrigin
public class PingController {

	@GetMapping("/ping")
	public Map<String, String> ping() {
		return Map.of("ping", UUID.randomUUID().toString());
	}

}
