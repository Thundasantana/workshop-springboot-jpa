package com.devlyon.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlyon.course.entities.Uso;

@RestController
@RequestMapping(value = "/uso")
public class UsoResource {

	@GetMapping
	public ResponseEntity<Uso> findAll() {
		Uso u = new Uso(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
