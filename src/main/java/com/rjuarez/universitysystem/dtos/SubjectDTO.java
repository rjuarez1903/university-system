package com.rjuarez.universitysystem.dtos;

import com.rjuarez.universitysystem.models.Subject;

import java.time.LocalTime;

public class SubjectDTO {
    String name;
    LocalTime time;
    int maximumStudents;

    public SubjectDTO(Subject subject) {
        name = subject.getName();
        time = subject.getTime();
        maximumStudents = subject.getMaximumStudents();
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
}
