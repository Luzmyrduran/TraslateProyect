package com.traslate.prueba.controller;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.traslate.prueba.dto.TraslateRequest;
import com.traslate.prueba.dto.TraslateResponse;
import com.traslate.services.ITraslateService;

@RestController
@RequestMapping(path="/traslate-api/v1.0.0")
public class TraslateController {

private static final Logger logger = LoggerFactory.getLogger(TraslateController.class);
	
	@Autowired
	ITraslateService service;
		
	@RequestMapping(value = "/translation", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<TraslateResponse> portkey(@RequestBody TraslateRequest  traslaterequest){
		
		TraslateResponse response=new TraslateResponse();
		
		response=service.portkey(traslaterequest);
		
		response.setFormatFate(traslaterequest.getFormatFate());
		response.setFormatSource(traslaterequest.getFormatSource());
		response.setTextTraslate(response.getTextTraslate());
		
		return ResponseEntity
				.status(HttpStatus.OK)
				.headers(HttpHeaders.EMPTY)
				.body(response)
				;
    }
}
