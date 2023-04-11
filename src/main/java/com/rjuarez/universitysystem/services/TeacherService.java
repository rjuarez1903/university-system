package com.rjuarez.universitysystem.services;

import com.rjuarez.universitysystem.models.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher getTeacher(Long id);
    List<Teacher> getTeachers();
}
