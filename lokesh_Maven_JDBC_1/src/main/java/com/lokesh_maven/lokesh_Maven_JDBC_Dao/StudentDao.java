package com.lokesh_maven.lokesh_Maven_JDBC_Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {

	private Connection connect;
	private Statement statement;
	private PreparedStatement preparedstatement;
	private ResultSet result;
	public StudentDao() {
		
	}
	private void closeConnection() {
		try {
			if(connect!=null)
				connect.close();
			if(statement!=null)
				statement.close();
			if(preparedstatement!=null)
				preparedstatement.close();
			if(result!=null)
				result.close();
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	private void doConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect =DriverManager.getConnection("jdbc:mySQL://localhost:3306/lokesh","root","Lokesh@882");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
