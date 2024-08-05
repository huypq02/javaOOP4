package vn.edu.cybersoft.exercise1;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    private double hours_worked, hourly_rate;

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours worked: ");
        this.hours_worked = sc.nextDouble();
        System.out.println("Enter hourly rate: ");
        this.hourly_rate = sc.nextDouble();
    }

    @Override
    public void display_info(){
        super.display_info();
        System.out.println("Name: " + this.hours_worked);
        System.out.println("Age: " + this.hourly_rate);
        System.out.println("Salary: " + this.calculate_salary());
    }

    @Override
    public double calculate_salary(){
        return super.calculate_salary()*this.hours_worked*this.hourly_rate;
    }
}
