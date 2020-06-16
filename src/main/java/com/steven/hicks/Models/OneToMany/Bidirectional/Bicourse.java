package com.steven.hicks.Models.OneToMany.Bidirectional;

import javax.persistence.*;
import java.util.List;

//@Entity
public class Bicourse {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private int id;

    private String name;

    @OneToMany( )
    private List<Bistudent> students;

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

    public List<Bistudent> getStudents() {
        return students;
    }

    public void setStudents(List<Bistudent> students) {
        this.students = students;
    }
}
