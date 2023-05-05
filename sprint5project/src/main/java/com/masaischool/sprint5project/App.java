package com.masaischool.sprint5project;

import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;

import com.masaischool.sprint5project.exception.DataAlreadyExistException;
import com.masaischool.sprint5project.exception.EmptyListException;
import com.masaischool.sprint5project.exception.InvalidDetailsException;
import com.masaischool.sprint5project.exception.NotaCurrentUserException;
import com.masaischool.sprint5project.exception.SomethingWentWrongException;
import com.masaischool.sprint5project.exception.WrongCrediancialException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	Scanner sc = new Scanner(System.in);
    
    	
    	int choose = 0;
    	
    	try {
    		
    		
    	do {
    		
    		System.out.println("welcome in HRM Department");
        	System.out.println("1 - Admin section");
        	System.out.println("2 - Employee section");
        	System.out.println("0  - to Exit");
        	System.out.println("Enter Selection...");
        	System.out.println();
        	choose  = sc.nextInt();
    		switch(choose) {
    		case 1:
    			adminLoginUi(sc);
    			break;
    		case 2:
    			employeeLogin(sc);
    			break;
    		case 0:
    			System.out.println("Exited Successfully");
    			break;
			default:
				throw new InvalidDetailsException("Invalid selecttion");
			
    		}
    		
    	}while(choose != 0);
    	}catch(WrongCrediancialException wce) {
    		System.out.println(wce.getMessage());
    	} catch (InvalidDetailsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    
    	
    }
    
    private static void employeeLogin(Scanner sc) throws WrongCrediancialException {
		
    	
    	loginEmpUiEmp(sc);
    
    	
    	int choice = 0;
    		
    	try {
    	do {
    		
    		System.out.println("2 - update details");
        	System.out.println("3 - change password");
        	System.out.println("4 - leave ");
        	System.out.println("5 - check leave status");
        	System.out.println("6 - check leave history");
        	System.out.println("7 - total salary of month");
        	System.out.println("8 - Annual salary");
        	System.out.println("9 - Delete Account");
        	System.out.println("10 - logout");
        	System.out.println("0 - to exit");
        	System.out.println();
        	choice = sc.nextInt();
    		switch(choice) {
    		case 1:
    			loginEmpUiEmp(sc);
    			break;
    		case 2:
    			updateDetailsUiEmp(sc);
    			break;
    		case 3:
    			changePasswordUiEmp(sc);
    			break;
    		case 4:
    			leaveUiEmp(sc);
    			break;
    		case 5:
    			checkleaveStatusUiEmp(sc);
    			break;
    		case 6:
    			checkleaveHistoryUiEmp(sc);
    			break;
    		case 7:
    			totalSalaryOfMonthUiEmp(sc);
    			break;
    		case 8:
    			annualSalaryUiEmp(sc);
    			break;
    		case 9:
    			deleteAccountUiEmp(sc);
    			break;
    		case 10:
    			logoutUiEmp(sc);
    			choice = 0;
    			break;
			
    		case 0:
    			System.out.println("exited");
    			choice = 0;
    			break;
			default:
				System.out.println("Please enter correct data type");
				choice = 0;
				break; 
    			
    			
    		}
    		
    	}while(choice !=0);
    	
    	
    	}catch(SomethingWentWrongException som) {
    		System.out.println(som.getMessage());
    	}catch (WrongCrediancialException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (InvalidDetailsException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		} catch (NotaCurrentUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
    
   

		private static void logoutUiEmp(Scanner sc) throws SomethingWentWrongException {

			new EmployeeDaoImp().logoutEmp();
				
		}
		
		private static void deleteAccountUiEmp(Scanner sc) throws InvalidDetailsException, SomethingWentWrongException, NotaCurrentUserException {

			System.out.println("Enter username");
			String username = sc.next();
			new EmployeeDaoImp().deleteAccount(username);
				
		}
		
		private static void annualSalaryUiEmp(Scanner sc) throws InvalidDetailsException, NotaCurrentUserException {

			System.out.println("Enter username");
			String username = sc.next();
			
			System.out.println(new EmployeeDaoImp().AnnualSalary(username));
				
		}

		private static void totalSalaryOfMonthUiEmp(Scanner sc) throws InvalidDetailsException, NotaCurrentUserException {

			System.out.println("Enter username");
			String username = sc.next();
			
			new EmployeeDaoImp().totalSalaryOfMonth(username);
			
				
		}

		private static void checkleaveHistoryUiEmp(Scanner sc) throws InvalidDetailsException, NotaCurrentUserException {
			System.out.println("Enter username");
			String username = sc.next();
			
			new EmployeeDaoImp().checkleaveHistory(username);
				
		}

		private static void checkleaveStatusUiEmp(Scanner sc) throws InvalidDetailsException, NotaCurrentUserException {
			System.out.println("Enter username");
			String username = sc.next();
			System.out.println("Enter leave id");
			int lid = sc.nextInt();
			new EmployeeDaoImp().checkLeaveStatus(username, lid);
				
		}

		private static void leaveUiEmp(Scanner sc) throws InvalidDetailsException, NotaCurrentUserException {
			System.out.println("Enter username");
			String username = sc.next();
			System.out.println("Enter reason of taking leave");
			String reason = sc.next();
			System.out.println("Enter number of days");
			int noOfDays = sc.nextInt();
			new EmployeeDaoImp().leave(username, username, noOfDays);
				
		}

		private static void changePasswordUiEmp(Scanner sc) throws InvalidDetailsException, NotaCurrentUserException {
			System.out.println("Enter username");
			String username = sc.next();
			System.out.println("Enter old password");
			String oldPass = sc.next();
			System.out.println("Enter new password");
			String newPass = sc.next();
			new EmployeeDaoImp().changePassword(username,oldPass,newPass);
				
		}

		private static void updateDetailsUiEmp(Scanner sc) throws InvalidDetailsException, NotaCurrentUserException {
			System.out.println("Enter username");
			String username = sc.next();
			System.out.println("Enter new name"); 
			String name = sc.next();
			System.out.println("Enter new salary");
			int salary = sc.nextInt();
			
			new EmployeeDaoImp().updateDetails(username,name,salary);
				

				
		}

		private static void loginEmpUiEmp(Scanner sc) throws WrongCrediancialException {
			System.out.println("Enter username");
			String username = sc.next();
			System.out.println("Enter password");
			String password = sc.next();
			boolean b = new EmployeeDaoImp().loginEmp(username, password);
			if(b) {
				System.out.println("Login Successfull");
			}else {
				throw new WrongCrediancialException("Invalid username or password");
			}
			

			
		}

		
		
		
		
		
		
		private static void adminLoginUi(Scanner sc) throws WrongCrediancialException {
		
			loginDept(sc);
    	
    	
    	int choice = 0;
    	try {
    		
    	
	    	do {
	    		System.out.println("2 - add new department");
	        	System.out.println("3 - view all department");
	        	System.out.println("4 - update department name");
	        	System.out.println("5 - register employee");
	        	System.out.println("6 - change department of employee");
	        	System.out.println("7 - approve or deny leave request");
	        	System.out.println("8 - fire employee");
	        	System.out.println("9 - logout department");
	        	System.out.println("0 - to exit");
	        	System.out.println();
	        	choice = sc.nextInt();
	    		switch(choice) {

	    		case 2:
	    			AddNewDept(sc);
	    			break;
	    		case 3:
	    			viewAllDepartment();
	    			break;
	    		case 4:
	    			updateDepartment(sc);
	    			break;
	    		case 5:
	    			registerEmployee(sc);
	    			break;
	    		case 6:
	    			changeDepartmentOfEmployee(sc);
	    			break;
	    		case 7:
	    			approveOrDenyLeaveRequest(sc);
	    			break;
	    		case 8:
	    			fireEmployee(sc);
	    			break;
	    		case 9:
	    			logoutDepart ();
	    			choice = 0;
	    			break;
	    		case 0:
	    			System.out.println("exited");
	    			choice = 0;
	    			break;
    			default:
    				System.out.println("Please enter correct data type");
    				choice = 0;
    				break;
    				
	    		}
	    		
	    	}while(choice !=0);
    	
    	}catch(DataAlreadyExistException ex) {
    		System.out.println(ex);
    	
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidDetailsException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (SomethingWentWrongException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

	private static void logoutDepart() {
	// TODO Auto-generated method stub
		
	new DepartmentDaoImp().logoutDepartment();
}

	private static void fireEmployee(Scanner sc) {
	
		System.out.println("enter employee username");
		String uname = sc.next();
		System.out.println("Enter department name");

		String dname = sc.next();
		new DepartmentDaoImp().fireEmployee(uname,dname);
}

	private static void approveOrDenyLeaveRequest(Scanner sc) {

		System.out.println("Enter your username");
		String uname = sc.next();
		System.out.println("Enter reason of taking leave");
		String reason = sc.next();
		System.out.println("Enter number of days");
		int noOfDays = sc.nextInt();
		new DepartmentDaoImp().approveOrDenyLeaveRequest(uname, reason, noOfDays);
	
}

	private static void changeDepartmentOfEmployee(Scanner sc) throws InvalidDetailsException {
	
		System.out.println("Enter employee usrname");
		String username = sc.next();
		System.out.println("Enter previous department name");
		String pname = sc.next();
		System.out.println("Enter new department name");
		String dname = sc.next();
		new DepartmentDaoImp().changeDepartmentOfEmployee(username, pname, dname);
	
}

	private static void registerEmployee(Scanner sc) throws InvalidDetailsException, SomethingWentWrongException {
	// TODO Auto-generated method stub
		System.out.println("Enter department name");
		String dname = sc.next();
		System.out.println("Enter employee name");
		String ename = sc.next();
		System.out.println("Enter employee email");
		String eemail = sc.next();
		System.out.println("Enter employee salary");
		int sal = sc.nextInt();
		
		Employee emp = new Employee();
		emp.setName(ename);
		emp.setEmail(eemail);
		emp.setSalary(sal);
		
//		try {
			new DepartmentDaoImp().registerEmployee(emp, dname);
//		}catch(InvalidDetailsException inv) {
//			System.out.println(inv.getMessage());
//		}catch(SomethingWentWrongException some) {
//			System.out.println(some.getMessage());
//		}
		
	
}

	private static void updateDepartment(Scanner sc) throws InvalidDetailsException {

		System.out.println("Enter old department name");
		String oName = sc.next();
		System.out.println("Enter new department name");
		String nName = sc.next();
		new DepartmentDaoImp().updateDepartmentName(oName,nName);
	
}

	private static void viewAllDepartment() throws EmptyListException {
	// TODO Auto-generated method stub
		new DepartmentDaoImp().viewAllDepartment();;
	
	}

	private static void AddNewDept(Scanner sc) throws DataAlreadyExistException {
	
		System.out.println("Enter depertment name");
		String name = sc.next();
		new DepartmentDaoImp().addNewDepartment(name);
	
	}

	private static void loginDept(Scanner sc) throws WrongCrediancialException {
	
		System.out.println("Enter admin name");
		String username = sc.next();
		System.out.println("Enter admin password");
		String password = sc.next();
		
		DepartmentDao da = new DepartmentDaoImp();
	
		if(da.loginDepartment(username, password)) {
			System.out.println("Successfully login");
			
		}
		else {
			System.out.println("failed login");
		}
	
}


	public static void add() {
    	
    	
//    	EntityManager em = Dutils.getManager();
//    	
//    	Department dp = new Department();
//    	dp.setName("prem_HR");
//    	
//    	Employee e = new Employee();
//    	e.setName("kumar");
//    	e.setEmail("premstart10@gmail.com");
//    	e.setSalary(10000);
//    	e.setPassword("123456");
//    	e.setDepartment(dp);
//    	e.setJoinningDate(new Date(System.currentTimeMillis()));
//    	
//    	Set<Employee> setem = new HashSet<>();
//    	setem.add(e);
//    	
//    	dp.setEmployee(setem);
//    	 
//    	em.getTransaction().begin();
//    	try {
//    		em.persist(dp);
//    	}catch(Exception ex) {
//    		System.out.println(ex.getMessage());
//    	}
//    	
//    	em.getTransaction().commit();
//    	em.close();
    }
    
    
    
    
}
