package com.app.StudentApplication.main.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.StudentApplication.main.model.Student;
import com.app.StudentApplication.main.ServiceInterface.StudentInterface;
import com.app.StudentApplication.main.StudentRepository.StudentRepository;

@Service
public class StudentImplementation implements StudentInterface{
	
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student saveStudent(Student stu) {
		// TODO Auto-generated method stub
		return studentRepository.save(stu);
	}

	@Override
	public Student updateStudent(Student stu) {
		// TODO Auto-generated method stub
		return studentRepository.save(stu);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	@Override
	public List<Student> getAllStu() {
		// TODO Auto-generated method stub
		return (List<Student>) studentRepository.findAll();
	}


	
}
