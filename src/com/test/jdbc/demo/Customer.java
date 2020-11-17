package com.test.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Customer {

	public static void main(String args[]) {
		try {
			insert();
			
			update();
			view();
			delete();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static void insert() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement smnt=(Statement) con.createStatement();
		for(int i=1;i<=10;i++) {
			String query="INSERT INTO  customer (PersonId,Name,EMAIL,PASSWORD)" +  "values(" +" "+i +" "+",'Anbarasan','anbutamil918@gmail.com','anbutamil')";
			int rs=smnt.executeUpdate(query);

		}
		con.close();
	}
	
	static void view() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		java.sql.Statement smnt= con.createStatement();
		String query="SELECT * from customer";
		ResultSet rs=smnt.executeQuery(query);
		while(rs.next())
			System.out.println(rs.getInt(1)+""+""+rs.getString(2)+""+""+rs.getString(3));
		con.close();
	}
	
	static void update() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		java.sql.Statement smnt= con.createStatement();
		String query="UPDATE customer" +" SET name='tamil' WHERE personId='1'";
		int rs=smnt.executeUpdate(query);
		
		con.close();
	}
	
	static void delete() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		java.sql.Statement smnt= con.createStatement();
		String query="DELETE FROM customer" +" WHERE personId=1";
		int rs=smnt.executeUpdate(query);
		
		con.close();
	}
	
}
