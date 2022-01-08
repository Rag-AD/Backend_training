package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class studentcontroller {
    @Autowired
    studentservice studentservice1;

    @GetMapping
    public List<student> getstudent(){
        return studentservice1.Studentrepository.getstudent();
    }
    @PostMapping
    public static void  registerstudent(@RequestBody student student1){
        studentservice.addstudent(student1);
    }
    @DeleteMapping(path="{StudentId}")
    public void  deletestudent(@PathVariable("StudentId") Long StudentId){
        studentservice1.deletestudent(StudentId);
    }
    @PutMapping(path="{StudentId}")
    public void updateStudent(
            @PathVariable("StudentId") long studentId,
            @RequestParam(required = false)String Name,
            @RequestParam(required = false)Integer Age){

        studentservice1.updateStudent(studentId,Name,Age);

    }

}
