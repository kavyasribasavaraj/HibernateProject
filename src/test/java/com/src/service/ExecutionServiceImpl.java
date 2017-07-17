package com.src.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Component;

import com.src.service.impl.MyConfigClass;


@Component("auto")
public class ExecutionServiceImpl {
	
	private static ApplicationContext applicationContext ;
	@Autowired 
	private DBOperations dbOperationsService;
	static{
		applicationContext= new AnnotationConfigApplicationContext(MyConfigClass.class); // return full path of that class
	}

	public void execute() throws ClassNotFoundException{
		dbOperationsService.createtable();
		dbOperationsService.insertvalues();
		dbOperationsService.selectvalues();
	}
	
	/*public static void main(String args[]) throws ClassNotFoundException{
		DBConnection dbConnection=(DBConnection) applicationContext.getBean("DBConnection");
		DBOperations dbOperationService=(DBOperations)applicationContext.getBean("DBOperations");
		dbOperationService.setbean(dbConnection);
		dbOperationService.createtable();
		dbOperationService.insertvalues();
		dbOperationService.selectvalues();		 
	}*/
	
public static void main(String args[]) throws ClassNotFoundException{
	ExecutionServiceImpl main=(ExecutionServiceImpl)applicationContext.getBean("auto");
	main.execute();
}
	
	
}
