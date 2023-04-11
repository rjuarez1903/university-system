package com.rjuarez.universitysystem.services.implementations;

import com.rjuarez.universitysystem.models.Teacher;
import com.rjuarez.universitysystem.repositories.TeacherRepository;
import com.rjuarez.universitysystem.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImplementation implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public Teacher getTeacher(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }
}
