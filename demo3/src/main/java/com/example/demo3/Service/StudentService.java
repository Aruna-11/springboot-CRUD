package com.example.demo3.Service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo3.DTO.DTOdata;
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
	 
	 public DTOdata datas(DTOdata dtodata) {
		 Student student=new Student();
		 
	
		 student.setName(dtodata.getName());
		 student.setAddress(dtodata.getAddress());
		 
		 Student savedata=studentRepository.save(student );
		 
		 DTOdata saveDTOdata=new DTOdata();
		 
		 saveDTOdata.setId(savedata.getId());
		 saveDTOdata.setName(savedata.getName());
		 saveDTOdata.setAddress(savedata.getAddress());
		 
		 return dtodata;
	 }
	 
	 public Page<Student> getstudent(int page,int size){
		 Pageable pageable = PageRequest.of(page, size);
		 return studentRepository.findAll(pageable);
	 }
}
