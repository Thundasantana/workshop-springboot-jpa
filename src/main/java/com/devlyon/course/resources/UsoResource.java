package com.devlyon.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlyon.course.entities.Uso;
import com.devlyon.course.services.UsoService;

@RestController
@RequestMapping(value = "/uso")
public class UsoResource {

	@Autowired
	private UsoService service;

	@GetMapping
	public ResponseEntity<List<Uso>> findAll() {
		List<Uso> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Uso> findById(@PathVariable Long id) {
		Uso obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
