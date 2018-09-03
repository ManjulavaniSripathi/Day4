package com.day4;

public class employeeLateral {
	String employeeId;
	String employeeName;
	double basicSalary;
	public static final double medical=500;
	public static final double pt=200;
	public employeeLateral() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employeeLateral(String employeeId, String employeeName, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public static double getMedical() {
		return medical;
	}
	public static double getPt() {
		return pt;
	}
	
	
	
	public double calculateNetSalary()
	{
		double netSalary = 0;
		double hra=0.5*basicSalary;
		double pf=0.12*basicSalary;
		double grossSalary=hra+basicSalary+medical;
		
		
		netSalary=grossSalary-(pf+pt);
		return netSalary;
		
	}
	
	
	public void displayDetails()
	{
		this.toString();
	}
	
	
	
	@Override
	public String toString() {
		return "employeeId=" + employeeId + "\nemployeeName=" + employeeName + "\nbasicSalary="
				+ basicSalary;
	}
	
}
