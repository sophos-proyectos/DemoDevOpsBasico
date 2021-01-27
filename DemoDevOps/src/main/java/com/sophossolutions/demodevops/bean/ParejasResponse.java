package com.sophossolutions.demodevops.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParejasResponse {

	private int objetivo;
	private String numeros;
	private String parejas;

}
