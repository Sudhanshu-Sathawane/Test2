package com.college.dao;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import com.college.model.Employee;

public class EmployeeDao {

 public Connection getConnection()throws Exception

 {

 Class.forName("com.mysql.cj.jdbc.Driver");

 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");

 return con;

 }

 public String register(Employee e)

 {

 int i=0;

 try {

  PreparedStatement ps=getConnection().prepareStatement("insert into employ values(?,?,?)");

  ps.setInt(1, e.getEno());

  ps.setString(2,e.getEname());

  ps.setDouble(3, e.getSalary());

  i=ps.executeUpdate();

 } catch (Exception e2) {

  // TODO: handle exception

 }

 if(i>0)

 {

  return "successfully inserted data";

 }

 else

 {

  return "fail";

 }

 }

}

