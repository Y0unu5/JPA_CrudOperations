package com.tns.jpacrud.entities;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUId = 1L;

	private int studentId;
	private String name;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
