package com.aikyatech.model;

public class HrDepartment extends SuperDepartment {

	public String departmentName() // create method departmentName
	{
		return "Hr Department";		// return hr department	
	}
	public String getTodaysWork() // create method getTodaysWork
	{
		return "Fill today’s worksheet and mark your attendance"; 
	}
	public String getWorkDeadline() //create method getWorkDeadline
	{
		return "Complete by EOD"; // return complete by eod
	}
	public String doActivity() // create method doActivity
	{
		return "team Lunch"; // return team lunch
	}

}
