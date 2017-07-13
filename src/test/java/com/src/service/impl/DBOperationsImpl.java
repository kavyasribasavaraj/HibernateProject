package com.src.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.src.service.DBConnection;
import com.src.service.DBOperations;
public class DBOperationsImpl  implements DBOperations{

	private DBConnection  dbConnection;
	public void setbean(DBConnection dbConnection){
		
		this. dbConnection= dbConnection;
	}
		public void createtable() throws ClassNotFoundException {
			try{
				Connection con=dbConnection.getConnection();
				 Statement stmt = null;
				 stmt = con.createStatement();
			     String sql1="DROP TABLE IF EXISTS example ";
			     stmt.execute(sql1);
			     String sql = "CREATE TABLE example " +
			                  "(id INTEGER not NULL, " +
			                  " name VARCHAR(255), " + 
			                  " PRIMARY KEY ( id ))";
				 

			     stmt.execute(sql);
			     System.out.println("Created table in given database...");
			     
				 }
				 catch(SQLException se){
					    
				     se.printStackTrace();
				  }
			
		}
		
		public void insertvalues() throws ClassNotFoundException {
			try{
				Connection con=dbConnection.getConnection();
				 Statement stmt = null;
				 stmt = con.createStatement();
			     
				 String sql = "INSERT INTO example " +
		                   "VALUES (14, 'harie')";
				 

			     stmt.executeUpdate(sql);
			     System.out.println("Values Inserted");
			     
				 }
				 catch(SQLException se){
					    
				     se.printStackTrace();
				  }
			
		}
		public void selectvalues( ) throws ClassNotFoundException {
			try{
				Connection con=dbConnection.getConnection();
				 Statement stmt = null;
				 stmt = con.createStatement();
			     
				 String sql = "SELECT * FROM example" ;
				 ResultSet rs = stmt.executeQuery(sql); 

				 while(rs.next()){
			         //Retrieve by column name
			         int id  = rs.getInt("id");
			      
			         String name = rs.getString("name");
			         

			         //Display values
			         System.out.print("ID: " + id);
			        
			         System.out.print("Name: " + name);
			         
				 }
			     
				 }
				 catch(SQLException se){
					    
				     se.printStackTrace();
				  }
						
		}


	
}
