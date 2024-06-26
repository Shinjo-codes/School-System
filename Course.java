package org.example;

/**This is a school management system with the course class containing fields such as id,
 * name, course teacher
 *
 */
public class Course {
    private String courseId;
    private String name;
    private Teacher courseTeacher;

    public Course(String courseId, String name, Teacher courseTeacher) {
        this.courseId = courseId;
        this.name = name;
        this.courseTeacher = courseTeacher;
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String courseId) {

        this.courseId = courseId;

            }
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;

           }
    public Teacher getTeacher() {

        return courseTeacher;
    }
    public Teacher setTeacher(Teacher courseTeacher) {

        this.courseTeacher = courseTeacher;

        return courseTeacher;
    }
    public void displayInfo() {
        System.out.println("Course ID: " + courseId + ", Name: " + name + ", Teacher: " + courseTeacher.getName());
    }
}

