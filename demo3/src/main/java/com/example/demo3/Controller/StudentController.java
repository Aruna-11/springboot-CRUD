package com.example.demo3.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.Entity.Student;
import com.example.demo3.Service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	
	//post
	@PostMapping("/post")
	public String createMethod(@RequestBody Student student) {
		studentService.create(student); 
    	return "Stored Successfully";
				
	}
	
	//getById
	@GetMapping ("/getStudent/{id}")
	public Optional<Student> getStudentById(@PathVariable int id) 
	{
		return studentService.getStudentById(id);
		
	}
	
	//getAll
	@GetMapping("/getStudent")
	public List<Student>StudentList() {       
	 return studentService.getStudent();
	}
	
	//postList
	@PostMapping("/studentList")
	public List<Student> studentList(@RequestBody List<Student> student) 
	{
		return studentService.createList(student);
	}
	
	//update
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
	    return studentService.update(student);
	}
	
	//delete
	
	@DeleteMapping("/deleteById/{id}")
	public String delete(@PathVariable int id)
	{
		studentService.deleteById(id);
		return "deleted sucessfully";
	}
}
