package com.rjuarez.universitysystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalTime;
import java.util.List;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    String name;

    LocalTime time;

    int maximumStudents;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id")
    Teacher teacher;

    @OneToMany(mappedBy = "subject", fetch = FetchType.EAGER)
    List<StudentSubject> studentSubjects;

    public Subject() {};

    public Subject(String name, LocalTime time, int maximumStudents, Teacher teacher) {
        this.name = name;
        this.time = time;
        this.maximumStudents = maximumStudents;
        this.teacher = teacher;
    }

    public void addStudentSubject(StudentSubject studentSubject) {
        studentSubjects.add(studentSubject);
        studentSubject.setSubject(this);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getMaximumStudents() {
        return maximumStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<StudentSubject> getStudentSubjects() {
        return studentSubjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setMaximumStudents(int maximumStudents) {
        this.maximumStudents = maximumStudents;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudentSubjects(List<StudentSubject> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }
}
