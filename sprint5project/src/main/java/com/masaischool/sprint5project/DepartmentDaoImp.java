package com.masaischool.sprint5project;

import com.masaischool.sprint5project.exception.DataAlreadyExistException;
import com.masaischool.sprint5project.exception.EmptyListException;
import com.masaischool.sprint5project.exception.InvalidDetailsException;
import com.masaischool.sprint5project.exception.WrongCrediancialException;

public class DepartmentDaoImp implements DepartmentDao{

	@Override
	public boolean loginDepartment(String username,String password) throws WrongCrediancialException {
		// TODO Auto-generated method stub
		if(username.equals(Utils.USERNAME)) {
			if(password.equals(Utils.PASSWORD)) {
				return true;
			}else {
				throw new WrongCrediancialException("Password is incorrect");
				
			}
		}else {
			throw new WrongCrediancialException("Username is incorrect");
		}
		
	}

	@Override
	public void addNewDepartment(String oName) throws DataAlreadyExistException {
		
		
	}

	@Override
	public void viewAllDepartment() throws EmptyListException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDepartmentName(String oName,String nName) throws InvalidDetailsException {
		
		
	}

	@Override
	public void registerEmployee(Employee employee, String deptName) throws InvalidDetailsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeDepartmentOfEmployee(String username, String prevDepName, String newDepName)
			throws InvalidDetailsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void approveOrDenyLeaveRequest(String username, String reason, int numOfDays) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fireEmployee(String username,String dName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logoutDepartment() {
		// TODO Auto-generated method stub
		
	}

}
