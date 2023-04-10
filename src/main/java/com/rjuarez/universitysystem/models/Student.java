package com.rjuarez.universitysystem.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    Long id;

    String firstName;

    String lastName;

    String dni;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    List<StudentSubject> studentSubjects;

    public Student() {}

    public Student(String firstName, String lastName, String dni) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
    }

    public void addStudentSubject(StudentSubject studentSubject) {
        studentSubjects.add(studentSubject);
        studentSubject.setStudent(this);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public List<StudentSubject> getStudentSubjects() {
        return studentSubjects;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setStudentSubjects(List<StudentSubject> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }
}
