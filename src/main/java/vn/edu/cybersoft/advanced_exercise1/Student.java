package vn.edu.cybersoft.advanced_exercise1;

import vn.edu.cybersoft.pkg.utils;

import java.util.Arrays;

public class Student extends Person {
    private String student_id;
    private String[] courses;

    public Student(String name, int age, String address, String student_id) {
        super(name, age, address);
        this.student_id = student_id;
        this.courses = new String[0];
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Student ID: " + this.student_id);
        System.out.print("Courses: ");
        for (String c : this.courses) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public boolean enroll(String course) {
        for (String c : this.courses){
            if (c.equals(course)){
                return false;
            }
        }
        this.courses = utils.append(this.courses, course);
        return true;
    }
}
