package vn.edu.cybersoft.exercise3;

public class Teacher extends Person{
    private String employee_id, subjects;

    public Teacher(String name, int age, String address, String employee_id, String subjects) {
        super(name, age, address);
        this.employee_id = employee_id;
        this.subjects = subjects;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Employee ID: " + this.employee_id);
        System.out.println("Subjects: " + this.subjects);
    }

    public boolean assign(String subject) {
        if (this.subjects.contains(subject)) {
            return false;
        }
        this.subjects += "," + subject;
        return true;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
