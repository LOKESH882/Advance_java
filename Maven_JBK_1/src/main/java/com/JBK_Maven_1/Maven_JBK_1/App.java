package com.JBK_Maven_1.Maven_JBK_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	System.out.println("Class Loaded...");
        	
        	Connection connect=DriverManager.getConnection("jdbc:mySQL://localhost:3306/lokesh", "root", "Lokesh@882");
        	
        	String query= "select * from student";
        	
        	PreparedStatement preparedStatement = connect.prepareStatement(query);
        	ResultSet result= preparedStatement.executeQuery();
        	while(result.next()) {
        		System.out.println("ID:" + result.getInt(1));
        		System.out.println("Name:" + result.getString(2));
        		System.out.println("--------------------");
        	}
        }catch(ClassNotFoundException e) {
        	System.out.println(e);
        }catch(SQLException e) {
        	System.out.println(e);
        }
    }
}
