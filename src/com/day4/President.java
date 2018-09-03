package com.day4;

public class President extends employeeLateral{
	private double kilometerTravelled;
	private static final double telAllowance=2000;
	public President() {
		super();
		// TODO Auto-generated constructor stub
	}

	public President(String employeeId, String employeeName, double basicSalary, double kilometerTravelled) {
		super(employeeId, employeeName, basicSalary);
		this.kilometerTravelled=kilometerTravelled;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateNetSalary()
	{
		
		return super.calculateNetSalary()+kilometerTravelled*8+telAllowance;
	}
		}


