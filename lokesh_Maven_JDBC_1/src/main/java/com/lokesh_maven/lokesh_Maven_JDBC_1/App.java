package com.lokesh_maven.lokesh_Maven_JDBC_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        	Connection connect =DriverManager.getConnection("jdbc:mySQL://localhost:3306/lokesh","root","Lokesh@882");
        	String query="Select * from employee";
        	PreparedStatement preparedStatement=connect.prepareStatement(query);
        	ResultSet result = preparedStatement.executeQuery();
        	while(result.next()) {
        		System.out.println("ID->"+result.getInt(1)+"\n Name->"+result.getString(3));
        		System.out.println("==============");
        	}
        }catch(ClassNotFoundException e) {
        	System.out.println(e);
        } catch (SQLException e) {
			System.out.println(e);
		}
    }
}
