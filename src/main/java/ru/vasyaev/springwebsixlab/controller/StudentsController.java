package ru.vasyaev.springwebsixlab.controller;

import ru.vasyaev.springwebsixlab.entity.Student;
import ru.vasyaev.springwebsixlab.service.students.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class StudentsController {
   private final StudentService studentService;
    @Autowired
    public StudentsController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> showAllStudents(){
        List<Student> allStudents = studentService.getAllStudent();
        return allStudents;
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody @Valid Student student, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            log.error("не правильный запрос на добавление данных");
            return null;
        }
        log.info("студент успешно добавлен");
        return studentService.saveStudent(student);
    }

    @PutMapping("students/{id}")
    public Student updeteStudent(@PathVariable("id") int id,@RequestBody @Valid Student student, BindingResult bindingResult){

        return studentService.putStudent(student,id);
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);
    }
}
