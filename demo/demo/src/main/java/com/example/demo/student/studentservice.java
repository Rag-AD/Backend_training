package com.example.demo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class studentservice {

    @Autowired
    studentrepository Studentrepository ;

    public static void addstudent(student student1) {
        System.out.println(student1);
    }

    public  void deletestudent(Long StudentId) {
        boolean exists=Studentrepository.existsById(StudentId);
        if(!exists){
            throw new IllegalStateException("student with id"+StudentId+"dose not exists");
        }
        Studentrepository.deleteById(StudentId);
    }
    public void updateStudent(Long StudentId,String Name,Integer Age){

        student Student =Studentrepository.findById(StudentId).orElseThrow(()-> new IllegalStateException("student with id"+StudentId+"dose not exists"));
        if(Name!=null && Name.length()>0 && !Objects.equals(Student.getName(),Name)){
            Student.setName(Name);
        }
        if(Age!=null && Age>0 && !Objects.equals(Student.getAge(),Age)){
            Student.setAge(Age);
        }

    }
    //List.of(new student ("Rag",20));}
}
