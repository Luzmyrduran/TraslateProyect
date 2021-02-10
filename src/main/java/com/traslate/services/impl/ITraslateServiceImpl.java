package com.traslate.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traslate.prueba.dto.TraslateRequest;
import com.traslate.prueba.dto.TraslateResponse;
import com.traslate.prueba.repository.TrRepository;
import com.traslate.services.ITraslateService;

@Service
public class ITraslateServiceImpl implements ITraslateService{

	@Autowired
	TrRepository repository;
	@Override
	public TraslateResponse portkey(TraslateRequest request) {
	
		TraslateResponse response= new TraslateResponse();
		
		String resp="";
		
		if(request.getFormatFate().equals("binary")) {
			
			resp=repository.traducirBinary(request.getText());
		}
		
		if(request.getFormatFate().equals("morse")) {
			
			resp=repository.traducirMorse(request.getText());
		}
		
		response.setTextTraslate(resp);
		
		return response;
	}
}
