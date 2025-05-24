package com.example.demo3.Service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo3.Entity.Student;
import com.example.demo3.Repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	//post
	
	public Student create(Student student) {
		
		return studentRepository.save(student);
	}

	
	//getbyID
	public Optional<Student> getStudentById(int id) {
		return studentRepository.findById(id);
	}
	
	//getlist
	 public List<Student> getStudent() 
	{
		return studentRepository.findAll();
	}
	 
	 //postlist
	 
	 public List<Student> createList(List<Student> student)
		{
			return studentRepository.saveAll(student);
		}
	 
	
	//update 
	 public Student update(Student student) {
		    return studentRepository.save(student);
		}
	 
	 //delete
	 
	 public void deleteById(int id) {
		    studentRepository.deleteById(id);
		}
}
