package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.database_SpringBoot.Service.StudentService;
import com.tka.entity.Student;

@RestController
@RequestMapping(value = "StudentAPI")
public class StudentController {

	@Autowired
	StudentService studentservice;

	// localhost:8081/StudentAPI/addStudentData
	@PostMapping(value = "addStudentData")
	public void insertStudentData(@RequestBody Student student) {
		System.out.println(student);
		studentservice.insertStudentRecord(student);
		System.out.println("Student Data Inserted...");
	}

	/*
	 * @PostMapping(value = "addStudentData") public String
	 * insertStudentData(@RequestBody Student student) { String
	 * str=studentservice.insertStudentRecord2(student); return str; }
	 */
}
