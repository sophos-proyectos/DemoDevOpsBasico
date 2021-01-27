package com.sophossolutions.demodevops.controller;

import com.sophossolutions.demodevops.bean.ParejasRequest;
import com.sophossolutions.demodevops.bean.ParejasResponse;
import com.sophossolutions.demodevops.service.ParejasService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parejas")
@RequiredArgsConstructor
@CrossOrigin
public class ParejasController {

	private final ParejasService parejasService;

	@PostMapping("")
	public ParejasResponse parejasSumanObjetivo(@RequestBody ParejasRequest request) {
		return parejasService.parejasSumanObjetivo(request);
	}

}
