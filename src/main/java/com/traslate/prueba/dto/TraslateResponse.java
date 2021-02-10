package com.traslate.prueba.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TraslateResponse {

	@NotBlank(message="text may not be blank")
	@NotNull(message="text may not be blank")
	private String textTraslate;
	
	@NotBlank(message="formatSource may not be blank")
	@NotNull(message="formatSource may not be blank")
	private String formatSource;
	
	@NotBlank(message="formatFate may not be blank")
	@NotNull(message="formatFate may not be blank")
	private String formatFate;
	
}
