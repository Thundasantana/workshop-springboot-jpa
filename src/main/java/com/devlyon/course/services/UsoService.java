package com.devlyon.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlyon.course.entities.Uso;
import com.devlyon.course.repositories.UsoRepository;



@Service
public class UsoService {

	@Autowired
	private UsoRepository repository;
	
	public List<Uso> findAll() {
		return repository.findAll();
	}
	
	public Uso findById(Long id) {
		Optional<Uso> obj = repository.findById(id);
		return obj.get();
	}
}
