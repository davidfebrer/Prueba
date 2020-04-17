package com.tribucio.prueba.entity.services;

import java.util.List;

import com.tribucio.prueba.entity.models.Prueba;

public interface IPruebaService {

	public Prueba get (long id);
	public List <Prueba> getAll();
	
}
