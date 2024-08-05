package vn.edu.cybersoft;

import vn.edu.cybersoft.advanced_exercise2.BankAccount;
import vn.edu.cybersoft.advanced_exercise2.CheckingAccount;
import vn.edu.cybersoft.advanced_exercise2.SavingsAccount;
import vn.edu.cybersoft.advanced_exercise4.ReferenceBook;
import vn.edu.cybersoft.advanced_exercise4.TextBook;
import vn.edu.cybersoft.advanced_exercise4.User;
import vn.edu.cybersoft.exercise1.Employee;
import vn.edu.cybersoft.exercise1.FullTimeEmployee;
import vn.edu.cybersoft.exercise1.PartTimeEmployee;
import vn.edu.cybersoft.exercise2.Book;
import vn.edu.cybersoft.exercise3.Course;
import vn.edu.cybersoft.exercise3.Student;
import vn.edu.cybersoft.exercise3.Teacher;

import java.util.Dictionary;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        // exercise 1 quan ly nhan vien cong ty
        System.out.println("Exercise 1: ");
        System.out.println("Employee: ");
        Employee e1 = new Employee();
        e1.nhap();
        e1.display_info();
        System.out.println("PartTimeEmployee: ");
        PartTimeEmployee e2 = new PartTimeEmployee();
        e2.nhap();
        e2.display_info();
        System.out.println("FullTimeEmployee: ");
        FullTimeEmployee e3 = new FullTimeEmployee();
        e3.nhap();
        e3.display_info();
        System.out.println("End of exercise 1.");

        // exercise 2 quan ly thu vien sach
        System.out.println("Exercise 2: ");
        System.out.println("Book: ");
        Book b1 = new Book("Java", "Cybersoft", "123456");
        b1.display_info();

        System.out.println("TextBook: ");
        TextBook tx1 = new TextBook("Java", "Cybersoft", "123456", "IT");
        tx1.display_info();

        System.out.println("ReferenceBook: ");
        ReferenceBook rf1 = new ReferenceBook("Java", "Cybersoft", "123456", "IT");
        rf1.display_info();
        System.out.println("End of exercise 2.");

        // exercise 3 quan ly he thong truong hoc
        System.out.println("Exercise 3: ");
        System.out.println("Student: ");
        Student s1 = new Student("Nguyen Van A", 20, "Ho Chi Minh", "ST123456", "Java 007,Python 001");
        s1.display_info();
        s1.enroll("Java 007");

        System.out.println("Teacher: ");
        Teacher t1 = new Teacher("Le Thi B", 30, "Ho Chi Minh", "TC123456", "Java");
        t1.display_info();
        t1.assign("Java");

        System.out.println("Course: ");
        Course c1 = new Course("C/C++ 005", "C005", "");
        Dictionary <String, String> dict = new Hashtable<>(){
            {
                put("Java 007", "JAVA007");
                put("Python 001", "PY001");
                put("Golang 003", "GO003");
            }
        };
        c1.setDictCourses(dict);
        c1.setCourse_name(c1.splitCourses(s1.getCourses())[1]);
        c1.setCourse_code(c1.getDictCourses().get(c1.getCourse_name()));
        c1.assign_teacher(t1.getName());
        c1.display_info();
        System.out.println("End of exercise 3.");

        // advanced exercise 1 quan ly he thong truong hoc
        vn.edu.cybersoft.advanced_exercise1.Student student1 =
                new vn.edu.cybersoft.advanced_exercise1.Student
                        ("Nguyen Van A", 20, "123 Nguyen Thuong Hien", "S001");
        vn.edu.cybersoft.advanced_exercise1.Teacher teacher1 =
                new vn.edu.cybersoft.advanced_exercise1.Teacher
                        ("Le Thi B", 35, "456 Vo Thi Sau", "T001");
        vn.edu.cybersoft.advanced_exercise1.Course course1 =
                new vn.edu.cybersoft.advanced_exercise1.Course("Math 101", "M101");

        student1.enroll(course1.getCourse_code());
        course1.assign_teacher(teacher1.getName());
        student1.display_info();
        teacher1.display_info();
        course1.display_info();


        // advanced exercise 2 quan ly ngan hang
        System.out.println("Advanced Exercise 2: ");
        System.out.println("Bank Account: ");
        CheckingAccount checkingAccount1 = new CheckingAccount("Nguyen Van B", "123457", 2000000, 100000);
        checkingAccount1.deposit(500000);
        checkingAccount1.withdraw(200000);
        checkingAccount1.display_info();
        System.out.println("Savings Account: ");
        SavingsAccount savingsAccount1 = new SavingsAccount("Le Thi C", "123458", 5000000, 0.05);
        savingsAccount1.deposit(1000000);
        savingsAccount1.withdraw(2000000);
        savingsAccount1.add_interest();
        savingsAccount1.display_info();

        // advanced exercise 4 quan ly thu vien sach vơi nguoi dung
        System.out.println("Advanced Exercise 4: ");
        System.out.println("Reference Book: ");
        vn.edu.cybersoft.advanced_exercise4.ReferenceBook referenceBook1 = new ReferenceBook("Java", "Cybersoft", "123456", "Basic Programming");
        System.out.println("Text Book: ");
        vn.edu.cybersoft.advanced_exercise4.TextBook textBook1 = new TextBook("Java", "Cybersoft", "123456", "IT");

        System.out.println("User: ");
        User user = new User("anv1", "Nguyen Van A");
        user.borrow(referenceBook1);
        user.borrow(textBook1);
        user.display_info();
    }
}