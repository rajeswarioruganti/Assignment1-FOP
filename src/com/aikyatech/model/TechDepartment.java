package com.aikyatech.model;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() // create method departmentName
	{
		return "Tech Department";	// return tech department	
	}
	public String getTodaysWork() // create method getTodaysWork
	{
		return "Complete coding of module 1"; // return Complete coding of module 1
	}
	public String getWorkDeadline()// create method getWorkDeadline
	{
		return "Complete by EOD";	// return Complete by EOD
	}
	public String getTechStackInformation()// create method getTechStackInformation
	{
		return "core java";		// return core java
	}

}
