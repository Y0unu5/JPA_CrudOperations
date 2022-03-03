package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		Student student = new Student();

		// Create Operation

		student.setStudentId(101);
		student.setName("Yunus");
		service.addStudent(student);
	}

}
