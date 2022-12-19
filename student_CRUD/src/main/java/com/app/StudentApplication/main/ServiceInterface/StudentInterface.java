package com.app.StudentApplication.main.ServiceInterface;

import java.util.List;

import com.app.StudentApplication.main.model.Student;

public interface StudentInterface {
	// to save new student
	public Student saveStudent (Student stu);
	
	//to update student
	public Student updateStudent (Student stu);
	
	//to delete students from DB
	public void deleteStudent(int id);
	
	//to fetch all students from database
	public List<Student> getAllStu();

}
