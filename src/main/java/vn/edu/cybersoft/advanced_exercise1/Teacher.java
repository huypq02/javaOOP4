package vn.edu.cybersoft.advanced_exercise1;

import vn.edu.cybersoft.pkg.utils;

import java.util.Arrays;

public class Teacher extends Person {
    private String employee_id;
    private String[] subjects;

    public Teacher(String name, int age, String address, String employee_id) {
        super(name, age, address);
        this.employee_id = employee_id;
        this.subjects = new String[0];
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Employee ID: " + this.employee_id);
        System.out.print("Subjects: ");
        for (String c : this.subjects) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public boolean assign(String subject) {
        for (String s : this.subjects){
            if(s.equals(subject)){
                return false;
            }
        }
        this.subjects = utils.append(this.subjects, subject);
        return true;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}
