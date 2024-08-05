package vn.edu.cybersoft.advanced_exercise1;

import java.util.Dictionary;
import java.util.Hashtable;

public class Course {
    private String course_name, course_code, teacher;

    public Course(String course_name, String course_code) {
        this.course_name = course_name;
        this.course_code = course_code;
        this.teacher = "";
    }

    public void assign_teacher(String teacher) {
        this.teacher = teacher;
    }

    public void display_info() {
        System.out.println("Course Name: " + this.course_name + ", Course Code: " + this.course_code);
        if (!this.teacher.isEmpty()){
            System.out.println("Assigned Teacher: " + this.teacher);
        }
    }


    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
