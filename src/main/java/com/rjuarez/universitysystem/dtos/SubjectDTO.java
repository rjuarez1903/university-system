package com.rjuarez.universitysystem.dtos;

import com.rjuarez.universitysystem.models.Subject;
import com.rjuarez.universitysystem.models.Teacher;

import java.time.LocalTime;

public class SubjectDTO {
    String name;
    LocalTime time;
    int maximumStudents;
    Teacher teacher;


    public SubjectDTO(Subject subject) {
        name = subject.getName();
        time = subject.getTime();
        maximumStudents = subject.getMaximumStudents();
        teacher = subject.getTeacher();
    };

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
}
