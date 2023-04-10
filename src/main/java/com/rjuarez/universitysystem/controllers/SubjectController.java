package com.rjuarez.universitysystem.controllers;

import com.rjuarez.universitysystem.models.Subject;
import com.rjuarez.universitysystem.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping("/subjects")
    public List<Subject> getSubjects() {
        return subjectService.getSubjects();
    }
}
