package vn.edu.cybersoft.exercise1;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = sc.nextLine();
        System.out.println("Enter age: ");
        this.age = sc.nextInt();
        System.out.println("Enter salary: ");
        this.salary = sc.nextDouble();
    }

    public void display_info(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.calculate_salary());
    }

    public double calculate_salary(){
        return this.salary;
    }
}
