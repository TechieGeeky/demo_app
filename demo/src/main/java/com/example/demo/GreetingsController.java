package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingsController {
	
	@GetMapping("/hello")
	public ResponseEntity<?> hello(){
		
		
		return new ResponseEntity<>("Hello", HttpStatus.OK);
	}

}
