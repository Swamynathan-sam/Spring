package com.tns.di;

public class Student 
{

	String studentName;	
	String id;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void display()
	{
		System.out.println("Student name is : "+ studentName+" id is: "+id);
	}
}