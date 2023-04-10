package com.rjuarez.universitysystem.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class StudentSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subject_id")
    Subject subject;

    public StudentSubject() {}

    public StudentSubject(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
