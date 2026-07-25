package org.test.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	

	@GetMapping("{sid}")
	public String student(@PathVariable("sid")int sid,Model model)
	{
		//System.out.println(sid);
		Optional<Student> student=this.studentRepo.findById(sid);
		if(student.isPresent())
		{
		 model.addAttribute("student",student.get());
		}
		return "student";
		
	}
	
	@GetMapping("/delete/{sid}")
	public String deleteStudent(@PathVariable("sid")int sid)
	{
		this.studentRepo.deleteById(sid);
		return "redirect:/students/list";
		
	}
	
	@GetMapping("showFormForupdate/{sid}")
	public String showFormForUpdate(@PathVariable("sid")int sid,Model model)
	{
		Optional<Student> student=this.studentRepo.findById(sid);
		if(student.isPresent())
		{
		 model.addAttribute("student",student.get());
		}
		
		return "update_form";
	}
	
	@PostMapping("update/{sid}")
	public String updateStudent(@PathVariable("sid")int sid,@ModelAttribute("student") Student student,BindingResult bindingResult,Model model)
	{
		
		if(bindingResult.hasErrors())
		{
			return "update_form";
		}
		
		Optional<Student> existingStudent=this.studentRepo.findById(sid);
		if(existingStudent.isPresent())
		{
		 
		Student oldStudentRecord=existingStudent.get();
		System.out.println(oldStudentRecord);

		 oldStudentRecord.setSname(student.getSname());
		 oldStudentRecord.setCity(student.getCity());
		 oldStudentRecord.setEmail(student.getEmail());
		 this.studentRepo.save(oldStudentRecord);
			
		 return "redirect:/students/list";
		}
		else
		{
			return "redirect:/students/list";
		}
		
		
		
	}
}
