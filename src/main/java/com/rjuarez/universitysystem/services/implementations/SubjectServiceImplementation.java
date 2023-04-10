package com.rjuarez.universitysystem.services.implementations;

import com.rjuarez.universitysystem.models.Subject;
import com.rjuarez.universitysystem.repositories.SubjectRepository;
import com.rjuarez.universitysystem.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImplementation implements SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public Subject getSubject(Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    @Override
    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }
}
