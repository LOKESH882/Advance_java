package com.tka.database_springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.database_springdemo.entity.Person;
import com.tka.database_springdemo.service.MainService;

@RestController
@RequestMapping(value = "personAPI")
public class MainController {

	@Autowired
	MainService service;
	
	// localhost:8080/personAPI/person
	@PostMapping(value = "person")
	public void addPersonData(@RequestBody Person person) {
		System.out.println(person);
		service.insertData(person);
		System.out.println("Person Data Inserted....");
	}
}
