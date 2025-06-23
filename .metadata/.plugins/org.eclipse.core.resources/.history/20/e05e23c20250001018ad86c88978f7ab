package com.tka.database_springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tka.database_springdemo.dao.MainDao;
import com.tka.database_springdemo.entity.Person;

@Service
// @Component
public class MainService {

	@Autowired
	MainDao dao;
	
	public void insertData(Person person) {
		dao.insertData(person);
	}
}
