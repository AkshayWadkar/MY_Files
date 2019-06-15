package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.entities.Student;
import com.cg.service.StudentService;



@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index.obj")
	public String getHomePage(Model model){
		model.addAttribute("stuList",studentService.loadAll());
		model.addAttribute("departments",new String[]{"EXTC","Comps","Mechanical","Instru"});
		model.addAttribute("student",new Student());
		return "index";
	}
	
	@RequestMapping(value="/save.obj",method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("student") Student student, Model model){
		student =  studentService.save(student);
		model.addAttribute("message","Student with id "+student.getStudentId()+" added successfully!");
		return "redirect:/index.obj";
	}

}
