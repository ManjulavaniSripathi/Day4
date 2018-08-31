package com.day4;


public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	public final double SpecialAllowance=250.80;
	public final double HRA=1000.50;
	public Employee() {
		
	}
	public Employee (int employeeId,String employeeName,String employeeAddress,long employeePhone) {
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.employeeAddress=employeeAddress;
	this.employeePhone=employeePhone;
	

}
	public double calculateSalary(double basicSalary) {
	double Salary = basicSalary + (basicSalary * SpecialAllowance / 100) + (basicSalary * HRA / 100);
    System.out.println("Salary of a employee is: "+Salary);
 
	return Salary;
	}

}