package com.jisty.portal.student;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class StudentRepositoryTest {

    @Autowired
    private StudentRepository underTest;

    @Test
    void checkIfMatricNumberExists() {

        // given
        Student student = new Student("34676", "David Hume", "Philosophy", "18");
        underTest.save(student);

        // when
        Optional<Student> expected = underTest.findStudentByMatricNumber(student.getMatricNumber());

        // then
        assertThat(expected).isPresent();
    }
}
