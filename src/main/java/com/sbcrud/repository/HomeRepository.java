package com.sbcrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sbcrud.model.Student;


@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{

	public Student findByUid(int uid);
	public Student findByUnameAndPassword(String un, String ps);
}
