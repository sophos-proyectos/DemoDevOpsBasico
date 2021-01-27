package com.sophossolutions.demodevops.service;

import com.sophossolutions.demodevops.bean.ParejasRequest;
import com.sophossolutions.demodevops.bean.ParejasResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ParejasService {

	public ParejasResponse parejasSumanObjetivo(ParejasRequest request) {
		final int objetivo = request.getObjetivo();
		log.info("Objetivo: {}", objetivo);
		final List<Integer> numeros = request.getNumeros();
		log.info("Números: {}", numeros);

		final Map<Integer, Long> frecuencias = numeros.stream()
			.collect(
				Collectors.groupingBy(
					Function.identity(),
					Collectors.counting()
				)
			)
		;
		log.info("Frecuencias: {}", frecuencias);

		final List<List<Integer>> parejas = new ArrayList<>();
		for(int numero : numeros) {
			final int diferencia = objetivo - numero;
			if(frecuencias.containsKey(diferencia)) {
				final int veces = frecuencias.get(diferencia).intValue();
				for(int i = 0 ; i < veces ; i++) {
					parejas.add(List.of(numero, diferencia));
				}
				frecuencias.remove(diferencia);
				frecuencias.remove(numero);
			}
		}
		log.info("Parejas: {}", parejas);

		return ParejasResponse.builder()
			.objetivo(objetivo)
			.numeros(numeros.toString())
			.parejas(parejas.toString())
			.build()
		;
	}

}
