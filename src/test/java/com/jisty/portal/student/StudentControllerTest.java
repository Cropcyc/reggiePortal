package com.jisty.portal.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class StudentControllerTest {
    @Autowired
    private StudentController underTest;

    @Test
    void testRegisterNewStudent() {
        // given
        Student james = new Student("411", "James Bond", "Bourne Legacy", "28");

        // when
        underTest.registerNewStudent(james);

        // then
        assertEquals("James Bond", james.getNameOfStudent());
    }
}