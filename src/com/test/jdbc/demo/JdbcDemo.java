package com.test.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	 
	public static void main(String[]  args) {
		
		try {
			 insert(); 
			 view();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void insert() throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		 Statement stmt = con.createStatement();
		 String query="INSERT INTO persons (PersonID, LastName, FirstName, Address, City)" + "values(3,'arasan','anbu','19/b north raja street','chennai')";
		 int rs =stmt.executeUpdate(query);   
		 con.close();
	}
	
	static void view() {
		try {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		 Statement stmt = con.createStatement();
		 String query="SELECT * from persons";
		 ResultSet rs =stmt.executeQuery(query); 
		 while(rs.next())
			 System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4)+""+rs.getString(5));
		
		 con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	 
	
	
}
