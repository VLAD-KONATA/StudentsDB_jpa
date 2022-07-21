package com.example.studentsdb_jpa.service;


import com.example.studentsdb_jpa.dao.StudentDao;
import com.example.studentsdb_jpa.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;
    public void addStudent(Student student)
    {
        studentDao.save(student);
    }
    public List<Student> getStudents()
    {
        return studentDao.findAll();
    }

}

