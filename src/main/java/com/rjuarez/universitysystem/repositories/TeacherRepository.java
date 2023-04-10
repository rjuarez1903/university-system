package com.rjuarez.universitysystem.repositories;

import com.rjuarez.universitysystem.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
