package com.jisty.portal.student;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public void addNewStudent(Student student) {
		Optional<Student> studentOptional = studentRepository.findStudentByMatricNumber(student.getMatricNumber());
		if (studentOptional.isPresent()) {
			throw new IllegalStateException("You are already registered for this course");
		}
		studentRepository.save(student);
	}
}