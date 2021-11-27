package com.jisty.portal.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

	private final StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@PostMapping
	public void registerNewStudent(@RequestBody Student student) {
		studentService.addNewStudent(student);
	}

	@GetMapping
	public ResponseEntity<StudentResponse> studentResponse() {
		StudentResponse r = new StudentResponse();
		r.setResponseCode("200");
		r.setResponseMessage("Registration successful");
		r.setResponseDetail("Response detail resides here");

		return new ResponseEntity<>(r, HttpStatus.OK);
	}
}
