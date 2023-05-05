package com.masaischool.sprint5project;

import com.masaischool.sprint5project.exception.InvalidDetailsException;
import com.masaischool.sprint5project.exception.SomethingWentWrongException;
import com.masaischool.sprint5project.exception.WrongCrediancialException;

public interface EmployeeDao {

	public boolean loginEmp(String username,String password) throws WrongCrediancialException;
	
	public void updateDetails(String username) throws InvalidDetailsException;
	
	public void changePassword(String username) throws InvalidDetailsException;
	
	public int leave(String username,String reason,int noOfDays) throws InvalidDetailsException;
	
	public void checkLeaveStatus(String username,int leaveId) throws InvalidDetailsException;
	
	public void checkleaveHistory(String username) throws InvalidDetailsException;
	
	public int totalSalaryOfMonth(String username) throws InvalidDetailsException;
	
	public int AnnualSalary(String username) throws InvalidDetailsException;
	
	public void deleteAccount(String username) throws InvalidDetailsException,SomethingWentWrongException;
	
	public void logoutEmp() throws SomethingWentWrongException;
	
	
	
	
}
