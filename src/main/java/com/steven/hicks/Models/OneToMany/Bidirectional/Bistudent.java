package com.steven.hicks.Models.OneToMany.Bidirectional;

import javax.persistence.*;

//@Entity
public class Bistudent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToOne()
    private Bicourse course;

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

    public Bicourse getCourse() {
        return course;
    }

    public void setCourse(Bicourse course) {
        this.course = course;
    }
}
