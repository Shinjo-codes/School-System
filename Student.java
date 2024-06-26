package org.example;

/**This is a school management system with the student class to extend the Person class.
 *It contains details such as studentId, name, age, state of Origin.
 *
 */
import java.util.HashMap;
import java.util.Map;

public class Student extends Person {
    private String studentId; //stores the student unique id
    private Map<Course, Double> courses; //stores the course taken by students with their grades

//constructor for student class from the person parent class
    public Student(String name, int age, String studentId, String stateOfOrigin) {
        super(name, age, stateOfOrigin);//calls the constructor from the Person class which is the parent class.
        this.studentId = studentId;
        this.courses = new HashMap<>();
    }

    // Getters and Setters
    public String getStudentId() {

        return studentId; //returns the id of a student in the school
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public Map<Course, Double> getCourses() {

        return courses; //returns the courses registered by a student
    }

    // Methods to add and remove courses
    public void enrollCourse(Course course) {

        courses.put(course, null);  // Initially, no grade is assigned

    }
    public void dropCourse(Course course) {

        courses.remove(course);
    }
    public void assignGrade(Course course, double grade) {
        if (courses.containsKey(course)) {
            courses.put(course, grade);
        } else {
            System.out.println("Student not enrolled in the course.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + getName() + ", Age: " + getAge() + ", State of Origin: "
         + getStateOfOrigin()) ;
        System.out.println("Courses Enrolled:");
        for (Course course : courses.keySet()) {
            System.out.println("Course ID: " + course.getCourseId() + ", Name: " + course.getName() + ", Grade: " + courses.get(course));
        }
    }
}

