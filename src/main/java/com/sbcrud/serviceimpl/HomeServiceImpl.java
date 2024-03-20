package com.sbcrud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbcrud.model.Student;
import com.sbcrud.repository.HomeRepository;
import com.sbcrud.servicei.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Student s) {
		
		hr.save(s);
	}

	@Override
	public Iterable<Student> displayAll() {
		
		return hr.findAll();
	}

	@Override
	public Student editData(int uid) {
		
		Student st = hr.findByUid(uid);
		return st;
	}

	@Override
	public void deleteData(Student s) {
		
		hr.delete(s);
	}

	@Override
	public Student loginCheck(String un, String ps) {
		
		Student st = hr.findByUnameAndPassword(un, ps);
		return st;
	}

}
