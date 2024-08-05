package vn.edu.cybersoft.exercise1;

import java.util.Scanner;

public class FullTimeEmployee extends Employee{
    private double benefits;


    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter benefits: ");
        this.benefits = sc.nextDouble();
    }

    @Override
    public void display_info(){
        super.display_info();
        System.out.println("Benefits: " + this.benefits);
        System.out.println("Salary: " + this.calculate_salary());
    }

    @Override
    public double calculate_salary(){
        return this.benefits+super.calculate_salary();
    }
}
