package vn.edu.cybersoft.exercise3;

import java.util.Dictionary;
import java.util.Hashtable;

public class Course {
    private Dictionary<String, String> dictCourses= new Hashtable<>();
    private String course_name, course_code, teacher;

    public Course(String course_name, String course_code, String teacher) {
        this.course_name = course_name;
        this.course_code = course_code;
        this.teacher = teacher;
    }

    public String[] splitCourses(String str) {
        String[] arr = str.split(",");
        return arr;
    }

    public void display_info() {
        System.out.println("Course Name: " + this.course_name);
        System.out.println("Course Code: " + this.course_code);
        System.out.println("Assigned Teacher: " + this.teacher);
    }

    public void assign_teacher(String teacher) {
        this.teacher = teacher;
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

    public Dictionary<String, String> getDictCourses() {
        return dictCourses;
    }

    public void setDictCourses(Dictionary<String, String> dictCourses) {
        this.dictCourses = dictCourses;
    }
}
