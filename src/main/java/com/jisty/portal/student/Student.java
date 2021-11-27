package com.jisty.portal.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;
    private String matricNumber;
    private String nameOfStudent;
    private String courseOfStudy;
    private String numberOfUnits;

    public Student() {

    }

    public Student(String matricNumber, String nameOfStudent, String courseOfStudy, String numberOfUnits) {
        this.matricNumber = matricNumber;
        this.nameOfStudent = nameOfStudent;
        this.courseOfStudy = courseOfStudy;
        this.numberOfUnits = numberOfUnits;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public String getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(String numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    @Override
    public String toString() {
        return "Student{" + "matricNumber=" + matricNumber + ", nameOfStudent='" + nameOfStudent + '\''
                + ", courseOfStudy='" + courseOfStudy + '\'' + ", numberOfUnits=" + numberOfUnits + '}';
    }
}
