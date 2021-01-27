package com.sophossolutions.demodevops.bean;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ParejasRequest {

	private int objetivo;
	private List<Integer> numeros;

}
