package com.steven.hicks.Models.ManyToOne;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )

    private int id;
    private String name;

//    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
//    private List<Employee> m_employeeList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName( ){
        return name;
    }

    public void setName( String deptName ){
        this.name = deptName;
    }

//    public List<Employee> getEmployeeList() {
//        return m_employeeList;
//    }
//
//    public void setEmployeeList(List<Employee> employeeList) {
//        m_employeeList = employeeList;
//    }
}