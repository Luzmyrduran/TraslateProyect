package com.traslate.prueba.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TraslateRequest {

	@ApiModelProperty(required = true)
	@NotBlank(message="text may not be blank")
	@NotNull(message="text may not be blank")
	private String text;
	
	@ApiModelProperty(required = true)
	@NotBlank(message="formatSource may not be blank")
	@NotNull(message="formatSource may not be blank")
	private String formatSource;
	
	@ApiModelProperty(required = true)
	@NotBlank(message="formatFate may not be blank")
	@NotNull(message="formatFate may not be blank")
	private String formatFate;
	
}
