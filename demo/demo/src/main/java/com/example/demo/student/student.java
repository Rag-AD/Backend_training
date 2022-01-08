package com.example.demo.student;
import javax.persistence.*;
@Entity
@Table
public class student{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    public student() {}
    public student(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Long getId() {
        return id;}
    public void setId(Long id) {
        this.id = id;}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public Integer getAge() {
        return age;}
    public void setAge(Integer age) {
        this.age = age;}
    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
