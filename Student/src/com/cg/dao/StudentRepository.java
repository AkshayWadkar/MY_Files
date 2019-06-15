package com.cg.dao;

import java.util.List;

import com.cg.entities.Student;

public interface StudentRepository {

	public abstract Student save(Student student);

	public abstract List<Student> loadAll();

}
