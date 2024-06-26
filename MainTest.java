package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

        private Teacher teacher;
        private Student student;
        private Course course1;
        private Course course2;
        private Course course3;

        @BeforeEach
        void setUp() {
            Teacher teacher = new Teacher("Madam Grace", 47, "T001", "Niger");
            Student student = new Student("Emmanuel Joshua",23, "S003", "Imo");
            Course course1 = new Course("C001", "Sociology", teacher);
            Course course2 = new Course("C002", "Microbiology", teacher);
            Course course3 = new Course("C003", "English Language", teacher);
            this.teacher = teacher;

        }

        @Test
        void testCreateTeachers(){

        }
    }
