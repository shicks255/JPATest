package com.steven.hicks;

import com.steven.hicks.Models.ManyToOne.Department;
import com.steven.hicks.Models.ManyToOne.Employee;
import com.steven.hicks.Repositories.DepartmentRepository;
import com.steven.hicks.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Starter implements CommandLineRunner {

    @Autowired
    private DepartmentRepository m_departmentRepository;
    @Autowired
    private EmployeeRepository m_employeeRepository;
//    @Autowired
//    private CourseRepository m_courseRepository;
//    @Autowired
//    private StudentRepository m_studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Starter.class);
    }

    @Override
    public void run(String... args) throws Exception {

        Employee steve = new Employee();
        steve.setDeg("B.A. History");
        steve.setEname("Steve");
        steve.setSalary(124500.0);

        Department department = new Department();
        department.setName("Information Technology");
//        department.getEmployeeList().add(steve);

        steve.setDepartment(department);

        m_departmentRepository.save(department);
        m_employeeRepository.save(steve);

        List<Employee> employees = m_employeeRepository.findAll();
        Department department1 = m_departmentRepository.findAll().get(0);
        System.out.println(employees);


//        Student eric = new Student();
//        eric.setName("Eric");
//        Student chris = new Student();
//        chris.setName("Chris");
//
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(eric);
//        studentList.add(chris);
//
//        Course course = new Course();
//        course.setName("Biology");
//        course.setStudents(studentList);
//
//        m_studentRepository.save(eric);
//        m_studentRepository.save(chris);
//        m_courseRepository.save(course);
//
//        List<Student> found = m_studentRepository.findAll();
//        List<Course> courses = m_courseRepository.findAll();
//
//        System.out.println(courses);
    }
}
