package com.college.service;

import com.college.dao.EmployeeDao;

import com.college.model.Employee;

public class EmployeeService {

 public String register(Employee employee)

 {

 EmployeeDao edao=new EmployeeDao();

 return edao.register(employee);

 }

}