package com.aikyatech.driver;

import com.aikyatech.model.AdminDepartment;
import com.aikyatech.model.HrDepartment;
import com.aikyatech.model.TechDepartment;

public class DepartmentDriver {
	
	public static void main(String[] args)
	{
		//object creation for Admin Department
			AdminDepartment ad= new AdminDepartment();
			System.out.println("Welcome to " +ad.departmentName());
			System.out.println(ad.getTodaysWork());
			System.out.println(ad.getWorkDeadline());
			System.out.println(ad.isTodayAHoliday());	
			System.out.println();	
				
		//object creation for HR department		
		HrDepartment hd=new HrDepartment();
		System.out.println("Welcome to "+hd	.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());
		System.out.println();	
		
		//object creation for tech department
		TechDepartment td= new TechDepartment();
		System.out.println("Welcome to " +td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());	
		System.out.println(td.isTodayAHoliday());
		
	}
	

}
