package com.tribucio.prueba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tribucio.prueba.entity.models.Prueba;
import com.tribucio.prueba.entity.services.IPruebaService;

@RestController
public class PruebaControler{

	
	@Autowired
	IPruebaService pruebaService;
	
	@GetMapping("/prueba")
	public List<Prueba> getAllPrueba(){
		
		return pruebaService.getAll();
	}
	
	@GetMapping("/prueba")
	public Prueba getOne(@PathVariable(value = "id") long id) {
		return pruebaService.get(id);
	}
}
