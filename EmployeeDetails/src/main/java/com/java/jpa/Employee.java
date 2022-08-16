package com.java.jpa;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="EmpDet")

public class Employee {

  @Id

  //@GeneratedValue(strategy=GenerationType.AUTO)

  private int empNo;

  private String empName;
  
  private String empDes;
  private double empSal;
  @ElementCollection
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDes() {
	return empDes;
}
public void setEmpDes(String empDes) {
	this.empDes = empDes;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}




}

