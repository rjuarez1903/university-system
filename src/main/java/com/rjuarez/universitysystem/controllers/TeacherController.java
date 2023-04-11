package com.rjuarez.universitysystem.controllers;

import com.rjuarez.universitysystem.models.Teacher;
import com.rjuarez.universitysystem.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/teachers/{id}")
    public Teacher getSubject(@PathVariable Long id) {
        return teacherService.getTeacher(id);
    }

    @GetMapping("/teachers")
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }
}
