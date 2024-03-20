package com.sbcrud.servicei;

import com.sbcrud.model.Student;

public interface HomeServiceI {

	public void saveData(Student s);
	public Iterable<Student> displayAll();
	public Student editData(int uid);
	public void deleteData(Student s);
	
	public Student loginCheck(String un, String ps);
}
