package com.college.controller;

import java.util.Scanner;

import com.college.model.Employee;

import com.college.service.EmployeeService;

public class Main {

 public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);

 System.out.println("Enter employee no");

 int eno=sc.nextInt();

 sc.nextLine();

 System.out.println("Enter Employee name");

 String ename=sc.nextLine();

 System.out.println("Enter salary");

 double sal=sc.nextDouble();

 Employee employee=new Employee(eno, ename, sal);

 EmployeeService service=new EmployeeService();

 String res=service.register(employee);

 System.out.println(res);

 }

}