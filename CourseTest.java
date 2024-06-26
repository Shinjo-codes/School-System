package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseTest {
    private Course course;
    private Teacher teacher;

    @BeforeEach
    void setUp(){
        teacher = new Teacher("Emeka", 34, "T001", "Enugu");
        course = new Course("C001","Mathematics",teacher);

    }

    @Test
    void printCourseIdNameAndTeacher() {
        Course courseDetails = new Course("C001", "Geography", teacher);
        courseDetails.displayInfo();

    }

    @Test
    void returnsCourseId() {
        Course courseId = new Course("C001", "Geography", teacher);
        assertEquals("C001", courseId.getCourseId());

    }

    @Test
    void returnsCourseName() {
        Course courseName = new Course("C001", "Geography", teacher);
        assertEquals("Geography", courseName.getName());

    }

    @Test
    void returnsCourseTeacherName() {
        Course teacherName = new Course("C001", "Geography", teacher);
        assertEquals(teacher, teacherName.getTeacher());

    }

   // @Test
   // void setCourseId() {
      //  Course courseId = new Course("C001", "Geography", teacher);
   //     assertEquals("C001", courseId.setCourseId(String.valueOf(courseId)));

    }

    //@Test
  //  void setCourseTeacher() {
        //Course courseTeacher = new Course("C001", "Geography", teacher);
        //assertEquals("Emeka", courseTeacher.setTeacher(teacher));

    //}

   // @Test
   // void setCourseName() {
   //     Course courseName = new Course("C001", "Geography", teacher);
    //    assertEquals("Geography", courseName.setName());

   // }

