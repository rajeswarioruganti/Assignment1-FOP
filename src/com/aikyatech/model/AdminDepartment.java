package com.aikyatech.model;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() //create method departmentName
	{
		return "Admin Department";	//return admin department	
			
	}
	public String getTodaysWork() // create method getTodaysWork
	{
		return "Complete your documents Submission";  // return document submission
				
	}
	public String getWorkDeadline() // create method getWorkDeadline 
	{
		return "Complete by EOD"; // return Complete by EOD
	}
	
}

