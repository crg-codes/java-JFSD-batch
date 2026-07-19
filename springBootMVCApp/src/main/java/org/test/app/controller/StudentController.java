package org.test.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.test.app.model.Student;
import org.test.app.repository.StudentRepo;

@Controller
@RequestMapping("/students/")
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@GetMapping("showForm")
	public String showStudentForm(Student student)
	{
		return "add-student";
	}

	@PostMapping("add")
	public String addStudent(Student student,BindingResult bindingResult,Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "add-student";
		}
		
		this.studentRepo.save(student);
		return "redirect:list";
		
	}
	
	@GetMapping("list")
	public String students(Model model)
	{
		model.addAttribute("students",this.studentRepo.findAll());
		return "studentList";
		
	}
}
