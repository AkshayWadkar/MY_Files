package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.StudentRepository;

import com.cg.entities.Student;


@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public List<Student> loadAll() {
		return studentRepository.loadAll();
	}

}
