package ru.vasyaev.springwebsixlab.dao.students;

import ru.vasyaev.springwebsixlab.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {
List<Student> getAllStudents();
Student saveStudent(Student student);
Student putStudent(Student student,int id);
Student getStudent(int id);
void deleteStudent(int id);

}
