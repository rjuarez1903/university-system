package com.rjuarez.universitysystem.repositories;

import com.rjuarez.universitysystem.models.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StudentSubjectRepository extends JpaRepository<StudentSubject, Long> {

}
