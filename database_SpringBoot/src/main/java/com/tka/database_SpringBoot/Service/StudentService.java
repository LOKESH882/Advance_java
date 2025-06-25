package com.tka.database_SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.database_SpringBoot.studentDao.StudentDao;
import com.tka.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	public void insertStudentRecord(Student student) {
		dao.insertStudentRecord(student);
	}
	
	public String  insertStudentRecord2(Student student) {
		String str=dao.insertStudentRecord2(student);
		return str;
	}
}
