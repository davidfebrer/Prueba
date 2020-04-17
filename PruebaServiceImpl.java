package com.tribucio.prueba.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tribucio.prueba.entity.dao.IPruebaDao;
import com.tribucio.prueba.entity.models.Prueba;

@Service
public class PruebaServiceImpl implements IPruebaService{

	
	@Autowired
	private IPruebaDao pruebaDao;
	
	
	@Override
	public Prueba get(long id) {
		// TODO Auto-generated method stub
		return pruebaDao.findById(id).get();
	}

	@Override
	public List<Prueba> getAll() {
		// TODO Auto-generated method stub
		return (List<Prueba>)  pruebaDao.findAll();
	}

}
