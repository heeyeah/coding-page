package com.code.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.controller.dto.TestResponse;

@RestController
@RequestMapping("test")
public class TestController {

	private Logger logger = LoggerFactory.getLogger(getClass());


	@GetMapping(value="/{me}")
	public ResponseEntity<TestResponse> callMeTest(@PathVariable String me) {
		
		logger.debug("execute callMeTest :p");
		logger.debug("My name is {}", me);
		
		
		return new ResponseEntity<TestResponse>(new TestResponse(), HttpStatus.OK);
	}
}
