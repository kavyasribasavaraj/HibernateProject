package com.src.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.src.service.DBConnection;


public class DBConnectionImpl implements DBConnection {

	@Override
	public Connection getConnection() throws ClassNotFoundException {
		final String USER = "root";
		  final String PASS = "mypassword";
		  
		  
		  Connection conn = null;
		 // Statement stmt = null;
		  try{
		     
		     Class.forName("com.mysql.jdbc.Driver");

		    
		     System.out.println("Connecting to a selected database...");
		     conn = DriverManager.getConnection("jdbc:mysql://trainingdb.c4hhsbxtkfor.ap-south-1.rds.amazonaws.com:3306/trainingTable", USER, PASS);
		     System.out.println("Connected database successfully...");
		     return conn;
		  }
		  catch(SQLException se){
			    
			     se.printStackTrace();
			  }
		return conn;
	}

	
	
}
