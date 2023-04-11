package com.rjuarez.universitysystem.services;

import com.rjuarez.universitysystem.dtos.SubjectDTO;
import com.rjuarez.universitysystem.models.Subject;

import java.util.List;

public interface SubjectService {
    SubjectDTO getSubject(Long id);

    List<SubjectDTO> getSubjects();
}
