package com.day4;

public class SalesManager extends employeeLateral{
	private double petrolAllowance;
	private double foodAllowance;
	private double otherlAllowance;
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}





	public SalesManager(String employeeId, String employeeName, double basicSalary) {
		super(employeeId, employeeName, basicSalary);
		// TODO Auto-generated constructor stub
	}





	@Override
	public double calculateNetSalary()
	{
		petrolAllowance=0.08*basicSalary;
		foodAllowance=0.13*basicSalary;
		otherlAllowance=0.03*basicSalary;
		
		return super.calculateNetSalary()+petrolAllowance+foodAllowance+otherlAllowance;
				
	}
	
}


