
package org.tnsindia.client;

import org.tnsindia.entities.Student;
import org.tnsindia.service.StudentService;
import org.tnsindia.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
	
		StudentService service=new StudentServiceImpl();
		
		Student student=new Student();
		
		//creation
		
		student.setRollNo(1214);
		student.setName("HARSHAL GHUGE");
		service.create(student);
		
		System.out.println("The data is inserted");
		
		
	
		
		
	
		


	

	}

}