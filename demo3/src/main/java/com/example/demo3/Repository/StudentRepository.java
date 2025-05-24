package com.example.demo3.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo3.Entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

	Optional <Student>  findById(int id);
	
	
	
	
	
}
