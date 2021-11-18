package com.jisty.portal.student;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class StudentServiceTest {
    @Autowired
    private StudentService underTest;

    @Test
    void checkThatErrorIsThrownIfMatricNumberExists() {
        // given
        Student stu = new Student("34676", "Jaja Opobo", "Emancipation", "45");
        underTest.addNewStudent(stu);

        // when
        Student stud = new Student("34676", "David Hume", "Philosophy", "18");

        // then
        assertThrows(IllegalStateException.class, () -> underTest.addNewStudent(stud));
    }
}
