package com.gv.app.services.interfaces;

import com.gv.app.models.Student;

public interface StudentService {

    boolean addStudent(Student student);

    Student getStudent(int id);

    int updateStudent(int id, Student student);

    boolean deleteStudent(int id);

}
