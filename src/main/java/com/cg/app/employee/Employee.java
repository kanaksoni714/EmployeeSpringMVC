package com.cg.app.employee;

public class Employee {
 public int empId;
 public String empName;
 public int salary;
 
 public Employee() {
	 
 }
public int getEmpId() {
	return empId;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee(int empId, String empName, int salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
}
}
