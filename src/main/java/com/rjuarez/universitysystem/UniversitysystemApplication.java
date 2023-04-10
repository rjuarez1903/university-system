package com.rjuarez.universitysystem;

import com.rjuarez.universitysystem.models.Student;
import com.rjuarez.universitysystem.models.StudentSubject;
import com.rjuarez.universitysystem.models.Subject;
import com.rjuarez.universitysystem.models.Teacher;
import com.rjuarez.universitysystem.repositories.StudentRepository;
import com.rjuarez.universitysystem.repositories.StudentSubjectRepository;
import com.rjuarez.universitysystem.repositories.SubjectRepository;
import com.rjuarez.universitysystem.repositories.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;

@SpringBootApplication
public class UniversitysystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversitysystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(StudentRepository studentRepository,
									  StudentSubjectRepository studentSubjectRepository,
									  SubjectRepository subjectRepository,
									  TeacherRepository teacherRepository) {
		return (args) -> {
			Student student1 = new Student("Rodrigo", "Juarez", "32155738");
			Student student2 = new Student("Renata", "Juarez", "56661333");
			Teacher teacher1 = new Teacher("Marina", "Calandra", "33783872", true);
			Subject subject1 = new Subject("History", LocalTime.NOON, 10, teacher1);
			Subject subject2 = new Subject("Math", LocalTime.MIDNIGHT, 20, teacher1);
			StudentSubject studentSubject1 = new StudentSubject(student1, subject1);
			StudentSubject studentSubject2 = new StudentSubject(student2, subject1);

			studentRepository.save(student1);
			studentRepository.save(student2);
			teacherRepository.save(teacher1);
			subjectRepository.save(subject1);
			subjectRepository.save(subject2);
			studentSubjectRepository.save(studentSubject1);
			studentSubjectRepository.save(studentSubject2);
		};
	}
}
