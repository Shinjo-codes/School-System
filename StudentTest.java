package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;
    private Course course1;
    private Course course2;
    private Teacher teacher;

    @BeforeEach
    public void SetUp(){
        student = new Student("Emmanuel Jonathan", 21, "S001", "Edo");
        course1 = new Course("C001", "Economics", teacher);
        course2 = new Course("C002", "Biology", teacher);
        teacher = new Teacher("Shina Musa", 48, "T001", "Jigawa");
    }

    @Test
    void returnsStudentId (){
        Student studentId = new Student("Emmanuel Jonathan", 21, "S001", "Edo");
        assertEquals("S001", studentId.getStudentId());
    }

    @Test
    public void testEnrollCourse() {
        student.enrollCourse(course1);
        assertTrue(student.getCourses().containsKey(course1));
    }

    @Test
    public void testDropCourse() {
        student.enrollCourse(course1);
        student.dropCourse(course1);
        assertFalse(student.getCourses().containsKey(course1));
    }

    @Test
    public void testAssignGrade() {
        student.enrollCourse(course1);
        student.assignGrade(course1, 95.0);
        assertEquals(95.0, student.getCourses().get(course1));
    }

    @Test
    public void testAssignGradeToNonEnrolledCourse() {
        student.assignGrade(course1, 95.0);
        assertNull(student.getCourses().get(course1));
    }

    @Test
    void displayStudentDetails() {
        Student display = new Student("Emmanuel Jonathan", 21, "S001", "Edo");
         display.displayInfo();
    }

}