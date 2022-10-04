package com.devlyon.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devlyon.course.entities.Uso;
import com.devlyon.course.repositories.UsoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UsoRepository usoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Uso u1 = new Uso(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		Uso u2 = new Uso(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		usoRepository.saveAll(Arrays.asList(u1, u2));
	}
}
