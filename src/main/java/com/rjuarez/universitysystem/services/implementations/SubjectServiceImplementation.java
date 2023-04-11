package com.rjuarez.universitysystem.services.implementations;

import com.rjuarez.universitysystem.dtos.SubjectDTO;
import com.rjuarez.universitysystem.models.Subject;
import com.rjuarez.universitysystem.repositories.SubjectRepository;
import com.rjuarez.universitysystem.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectServiceImplementation implements SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public SubjectDTO getSubject(Long id) {
        return subjectRepository.findById(id).map(SubjectDTO::new).orElse(null);
    }

    @Override
    public List<SubjectDTO> getSubjects() {
        return subjectRepository.findAll().stream().map(SubjectDTO::new).collect(Collectors.toList());
    }
}
