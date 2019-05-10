package com.stefanini.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Codigo;
import com.stefanini.projeto.repository.CodigoRepository;

@Service
public class CodigoService {

	@Autowired
	private CodigoRepository repository;
	
	public List<Codigo> findAll() throws TreinaException {
		return (List<Codigo>) repository.findAll();
	}

}