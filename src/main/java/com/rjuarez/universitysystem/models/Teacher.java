package com.rjuarez.universitysystem.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    Long id;

    String firstName;

    String lastName;

    String dni;

    boolean active;

    @OneToMany(mappedBy = "teacher", fetch=FetchType.EAGER)
    List<Subject> subjects;

    public Teacher() {}

    public Teacher(String firstName, String lastName, String dni, boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.active = active;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
        subject.setTeacher(this);
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

    public boolean isActive() {
        return active;
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

    public void setActive(boolean active) {
        this.active = active;
    }
}
