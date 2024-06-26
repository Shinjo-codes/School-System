package org.example;
        public class Main {
            public static void main(String[] args) {
                // Create teachers
                Teacher teacher1 = new Teacher("Tobi Ajayi", 35, "T001", "Oyo");
                Teacher teacher2 = new Teacher("Shina Ojo", 25, "T002", "Osun");
                Teacher teacher3 = new Teacher("Mallam Sanni", 46, "T003", "Gombe");

                // Create courses and assign teachers
                Course course1 = new Course("C001", "Mathematics", teacher1);
                Course course2 = new Course("C002", "Economics", teacher2);
                Course course3 = new Course("C003", "Biology", teacher3);

                // Add courses to teachers
                teacher1.addCourse(course1);
                teacher2.addCourse(course2);
                teacher3.addCourse(course3);

                // Create students
                Student student1 = new Student("Emeka Nnamani Chimdindu", 68, "S001", "Enugu");
                Student student2 = new Student("Jane Stone", 17, "S002", "Plateau");
                Student student3 = new Student("Mike Abdul", 20, "S003", "Lagos");

                // Enroll students in courses
                student1.enrollCourse(course1);
                student1.enrollCourse(course2);
                student2.enrollCourse(course2);
                student2.enrollCourse(course1);
                student3.enrollCourse(course3);



                // Assign grades
                student1.assignGrade(course1, 90);
                student1.assignGrade(course2, 85);
                student2.assignGrade(course2, 92);
                student2.assignGrade(course1, 75);
                student3.assignGrade(course3, 71);

                // Display information
                student1.displayInfo();
                student2.displayInfo();
                student3.displayInfo();
                teacher1.displayInfo();
                teacher2.displayInfo();
                teacher3.displayInfo();
                course1.displayInfo();
                course2.displayInfo();
                course3.displayInfo();
            }
        }
