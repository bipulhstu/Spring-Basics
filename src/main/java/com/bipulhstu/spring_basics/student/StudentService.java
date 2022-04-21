package com.bipulhstu.spring_basics.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,"Bipul Islam1", 26, LocalDate.of(1995, Month.NOVEMBER, 20), "bipulhstu@gmail.com"),
                new Student(2L,"Bipul Islam", 26, LocalDate.of(1995, Month.NOVEMBER, 20), "bipulhstu@gmail.com")
        );
    }
}
