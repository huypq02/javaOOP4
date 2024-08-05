package vn.edu.cybersoft.exercise3;

public class Student extends Person{
    private String student_id, courses;

    public Student(String name, int age, String address, String student_id, String courses) {
        super(name, age, address);
        this.student_id = student_id;
        this.courses = courses;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Student ID: " + this.student_id);
        System.out.println("Courses: " + this.courses);
    }

    public boolean enroll(String course) {
        if (this.courses.contains(course)) {
            return false;
        }
        this.courses += "," + course;
        return true;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}
