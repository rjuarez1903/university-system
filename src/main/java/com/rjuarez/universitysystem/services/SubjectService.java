package com.rjuarez.universitysystem.services;

import com.rjuarez.universitysystem.models.Subject;

import java.util.List;

public interface SubjectService {
    Subject getSubject(Long id);

    List<Subject> getSubjects();
}
