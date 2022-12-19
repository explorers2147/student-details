package com.app.StudentApplication.main.StudentRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.StudentApplication.main.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
