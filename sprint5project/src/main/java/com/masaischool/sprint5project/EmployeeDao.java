package com.masaischool.sprint5project;

import com.masaischool.sprint5project.exception.InvalidDetailsException;
import com.masaischool.sprint5project.exception.NotaCurrentUserException;
import com.masaischool.sprint5project.exception.SomethingWentWrongException;
import com.masaischool.sprint5project.exception.WrongCrediancialException;

public interface EmployeeDao {

	public boolean loginEmp(String username,String password) throws WrongCrediancialException;
	
	public void updateDetails(String username,String name,int salary) throws InvalidDetailsException,NotaCurrentUserException;
	
	public void changePassword(String username,String oldPass,String newPass) throws InvalidDetailsException,NotaCurrentUserException;
	
	public int leave(String username,String reason,int noOfDays) throws InvalidDetailsException,NotaCurrentUserException;
	
	public void checkLeaveStatus(String username,int leaveId) throws InvalidDetailsException,NotaCurrentUserException;
	
	public void checkleaveHistory(String username) throws InvalidDetailsException,NotaCurrentUserException;
	
	public int totalSalaryOfMonth(String username) throws InvalidDetailsException,NotaCurrentUserException;
	
	public int AnnualSalary(String username) throws InvalidDetailsException,NotaCurrentUserException;
	
	public void deleteAccount(String username) throws InvalidDetailsException,SomethingWentWrongException,NotaCurrentUserException;
	
	public void logoutEmp() throws SomethingWentWrongException;
	
	
	
	
}
