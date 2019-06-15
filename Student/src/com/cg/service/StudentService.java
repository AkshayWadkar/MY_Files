package com.cg.service;

import java.util.List;

import com.cg.entities.Student;


public interface StudentService {
	public abstract Student save(Student student);

	public abstract List<Student> loadAll();


}
