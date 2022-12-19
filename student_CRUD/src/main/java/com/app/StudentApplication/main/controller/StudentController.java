package com.app.StudentApplication.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.StudentApplication.main.ServiceImplementation.StudentImplementation;
import com.app.StudentApplication.main.model.Student;

@RestController
@CrossOrigin("*")
public class StudentController {
	// To create bean of implementation class
	@Autowired
	private StudentImplementation stuImpl;     //To call save method or to save the new student
	
	// This method is used to add a new student to database
	@PostMapping(value = "/SaveStudent")
	public Student addNewStu(@RequestBody Student student) {
		System.out.println("Add new student");
		stuImpl.saveStudent(student);
		return student;
	}
	
	//This is to modify the details of already existing students
	@PutMapping(value = "/UpdateStudent")
	public Student updateStu(@RequestBody Student student) {
		return stuImpl.updateStudent(student);
	}
	
	//This is to delete the entire details of the existing student
	@DeleteMapping(value = "/DeleteStudent")
	public String deleteStu(@RequestParam Integer id) {
		System.out.println("At delete student");
		stuImpl.deleteStudent(id);
		return "Student Deleted Successfully";
	}
	
	//This is used to display the details of all the students
	@GetMapping(value = "/ViewStudents")
	public List<Student> findAllStudent(){
		return stuImpl.getAllStu();
	}
}
