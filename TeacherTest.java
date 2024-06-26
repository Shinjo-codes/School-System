package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    private Teacher teacher;
    private Course course1;
    private Course course2;

    @BeforeEach
    void setUp (){
        Teacher teacher = new Teacher("Madam Grace", 47, "T001", "Niger");
        Course course1 = new Course("C001", "Sociology", teacher);
        Course course2 = new Course("C002", "Microbiology", teacher);
        this.teacher = teacher;
    }

    @Test
    void returnTeacherId (){
        Teacher returnTeacher = new Teacher("Madam Grace", 47, "T001", "Niger");
        assertEquals("T001",returnTeacher.getTeacherId());
    }

    /*@Test
    void returnTeacherCourse (){
        Teacher teacherCourse = new Teacher("Madam Grace", 47, "T001", "Niger");
        teacher.getCourses ();
        assertTrue("Microbiology",teacher.getCourses());
    }

     */

    @Test
    void testForAddingCourse (){
        teacher.addCourse(course1);
        assertTrue(teacher.getCourses().contains(course1) );

    }

    @Test
    void testForRemovingCourse (){
        teacher.addCourse(course1);
        teacher.removeCourse(course1);
        assertFalse(teacher.getCourses().contains(course1) );

    }

    @Test
    void testForDisplayingTeacherInfo (){
        teacher.displayInfo();

    }

}