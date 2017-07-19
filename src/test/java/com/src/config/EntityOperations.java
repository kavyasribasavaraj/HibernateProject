package com.src.config;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.src.service.Student;

public class EntityOperations {
	public static void main(String[] args) throws IllegalStateException {
		new EntityOperations().insert();
		new EntityOperations().show();
	}

	public void insert() throws IllegalStateException{

		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
	try{	
	session.beginTransaction();
	Student student1=new Student (1,"Kavya","Shree");
	session.save(student1);
	//Student student2=new Student (2,"Pria","Jain");
	//session.save(student2);
	session.getTransaction().commit();
	System.out.println("Values Inserted");
	}
	catch(HibernateException e)
	{
		if(tx!=null)
			tx.rollback();
		e.printStackTrace();
	}
	finally{
		session.close();
	}
	}
	
	public void show(){
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		
		tx=session.beginTransaction();
		List students=(List) session.createQuery("FROM Student").list();
		Iterator it= students.iterator();
		while(it.hasNext())
		{
			Student student=(Student) it.next();
			System.out.println("Firstname"+student.getFirstname());
			System.out.println("Lastname"+student.getLastname());
		}
		
	}
	
}
