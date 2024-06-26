package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private String teacherId;
    private List<Course> courses;

    public Teacher(String name, int age, String teacherId, String stateOfOrigin) {
        super(name, age, stateOfOrigin);
        this.teacherId = teacherId;
        this.courses = new ArrayList<>();
    }

    // Getters and Setters
    public String getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(String teacherId) {

        this.teacherId = teacherId;
    }
    public List<Course> getCourses() {

        return courses;
    }

    // Methods to add and remove courses
    public void addCourse(Course course) {

        courses.add(course);
    }

    public void removeCourse(Course course) {

        courses.remove(course);
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + teacherId + ", Name: " + getName() + ", Age: " + getAge() + ", State of Origin: "
        + getStateOfOrigin());
        System.out.println("Courses Taught:");
        for (Course course : courses) {
            System.out.println("Course ID: " + course.getCourseId() + ", Name: " + course.getName());
        }
    }
}

