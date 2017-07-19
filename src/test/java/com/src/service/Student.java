package com.src.service;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Student")
public class Student implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="FirstName")
	private String firstname;
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name="LastName")
	private String lastname;
	
	public Student(){
		super();
	}
	
	public Student(int id ,String firstname,String lastname){
		this.id=id;
		firstname=getLastname();
		lastname=getFirstname();
	}
	
	

}
