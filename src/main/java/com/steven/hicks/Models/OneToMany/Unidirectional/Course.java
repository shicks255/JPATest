package com.steven.hicks.Models.OneToMany.Unidirectional;

import javax.persistence.*;
import java.util.List;

//@Entity
public class Course {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private int id;

    private String name;

    @OneToMany( targetEntity = Student.class)
    private List<Student> students;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
