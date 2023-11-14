package ru.vasyaev.springwebsixlab.service.students;

import ru.vasyaev.springwebsixlab.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudent();
    Student getStudent(int id);
    Student putStudent(Student student,int id);
    Student saveStudent(Student student);
    void deleteStudent(int id);
}
