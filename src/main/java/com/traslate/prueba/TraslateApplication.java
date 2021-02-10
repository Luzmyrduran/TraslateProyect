package com.traslate.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.traslate.prueba.util.*;


@SpringBootApplication
public class TraslateApplication {

	private static final Logger logger = LoggerFactory.getLogger(TraslateApplication.class);
    
	@Autowired
    private ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		SpringApplication.run(TraslateApplication.class, args);
		Log.print(logger, "Correspondent API Started!!!");
	}

}
