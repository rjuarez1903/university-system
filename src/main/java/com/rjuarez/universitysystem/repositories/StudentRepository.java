package com.rjuarez.universitysystem.repositories;

import com.rjuarez.universitysystem.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long> {

}
