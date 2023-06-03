package com.jsp.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	int emp_id;
	String name;
	String email;
	
	public Employee(@Value(value = "104524")int emp_id, @Value(value = "XYX")String name, @Value(value = "XZX@gmail.com")String email) {
		this.emp_id=emp_id;
		this.name = name;
		this.email= email;
	}
		public void print() {
			System.out.println(emp_id);
			System.out.println(name);
			System.out.println(email);
		
	}
	
	
	

}
