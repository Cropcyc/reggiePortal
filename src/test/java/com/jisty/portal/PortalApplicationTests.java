package com.jisty.portal;

import com.jisty.portal.student.Student;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("DevJide Testing Microphone")
class PortalApplicationTests {

	@Test
	@DisplayName("Test the portal")
	void contextLoads() {

	}
	// @Test
	// @DisplayName("My first test passes")
	// void contextLoads() {
	// Student student = new Student(null, "jordo@go.cd", LocalDate.of(2003,
	// Month.APRIL, 21));
	// assertNull(student.getName(), "there's a name foo, it's " +
	// student.getName());
	// }

}
