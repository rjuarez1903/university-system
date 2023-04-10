package com.rjuarez.universitysystem.controllers;

import com.rjuarez.universitysystem.models.Subject;
import com.rjuarez.universitysystem.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping("/subject/{id}")
    public Subject getSubject(@PathVariable Long id) {
        return subjectService.getSubject(id);
    }

    @GetMapping("/subjects")
    public List<Subject> getSubjects() {
        return subjectService.getSubjects();
    }

}
