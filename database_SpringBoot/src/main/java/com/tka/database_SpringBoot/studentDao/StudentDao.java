package com.tka.database_SpringBoot.studentDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;
	
	public void insertStudentRecord(Student student) {
		Session session = factory.openSession();
		session.beginTransaction();
		session.persist(student);
		session.getTransaction().commit();
		session.close();
	}

	public String insertStudentRecord2(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
}
