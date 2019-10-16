package com.hemant.actuator.SpringBootAcutatorExample.cotrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConrtoller {

	@GetMapping("/call")
	public String call() {
		
		return "Called... ";
	}
	
}
