package com.jisty.portal.student;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
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
        assertNotNull(expected);
    }
}
