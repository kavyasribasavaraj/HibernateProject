package com.src.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionServiceImpl {
	private static ClassPathXmlApplicationContext applicationContext ;
	static{
		applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	public static void main(String args[]) throws ClassNotFoundException{
		DBConnection dbConnection=(DBConnection) applicationContext.getBean("DBConnection");
		DBOperations dbOperationService=(DBOperations)applicationContext.getBean("DBOperations");
		dbOperationService.setbean(dbConnection);
		dbOperationService.createtable();
		dbOperationService.insertvalues();
		dbOperationService.selectvalues();
		 
	}
	
}
