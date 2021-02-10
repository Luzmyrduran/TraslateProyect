package com.traslate.services;

import com.traslate.prueba.dto.TraslateResponse;
import com.traslate.prueba.dto.TraslateRequest;

public interface ITraslateService {

	public TraslateResponse portkey(TraslateRequest request);

}
