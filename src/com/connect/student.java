package com.connect;

import java.util.Scanner;

public class student {
	private int id,age;
	private String name;
	
	Scanner sc=new Scanner(System.in);
	public student() {
		super();
	}
	
	public student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void accept()
	{
		System.out.println("enter the id");
		 id=sc.nextInt();
		
		System.out.println("enter the Name");
		 name=sc.next();
		
		 System.out.println("enter the age");
		 age=sc.nextInt();
	}
	
	
	

}
