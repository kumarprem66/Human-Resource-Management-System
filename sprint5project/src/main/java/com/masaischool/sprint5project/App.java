package com.masaischool.sprint5project;

import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;

import com.masaischool.sprint5project.exception.DataAlreadyExistException;
import com.masaischool.sprint5project.exception.EmptyListException;
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
    	System.out.println("1 - Admin section");
    	System.out.println("2 - Employee section");
    	System.out.println("3  - to Exit");
    	System.out.println("Enter Selection...");
    	
    	int choose = 0;
    	
    	do {
    		
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
				System.out.println("Please enter valid data");
				break;
    		}
    		
    	}while(choose != 0);
    	
    	
    
    	
    }
    
    private static void employeeLogin(Scanner sc) {
		
    	System.out.println("1 - login");
    	System.out.println("2 - update details");
    	System.out.println("3 - change password");
    	System.out.println("4 - leave ");
    	System.out.println("5 - check leave status");
    	System.out.println("6 - check leave history");
    	System.out.println("7 - total salary of month");
    	System.out.println("8 - Annual salary");
    	System.out.println("9 - Delete Account");
    	System.out.println("10 - logout");
    	
    	int choice = 0;
    	do {
    		
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
    			break;
			
    		default:
    			break;
    			
    			
    		}
    		
    	}while(choice !=0);
		
	}
    
   

		private static void logoutUiEmp(Scanner sc) {
				// TODO Auto-generated method stub
				
			}
		
		private static void deleteAccountUiEmp(Scanner sc) {
				// TODO Auto-generated method stub
				
			}
		
		private static void annualSalaryUiEmp(Scanner sc) {
				// TODO Auto-generated method stub
				
			}

		private static void totalSalaryOfMonthUiEmp(Scanner sc) {
				// TODO Auto-generated method stub
				
		}

		private static void checkleaveHistoryUiEmp(Scanner sc) {
				// TODO Auto-generated method stub
				
		}

		private static void checkleaveStatusUiEmp(Scanner sc) {
				// TODO Auto-generated method stub
				
		}

		private static void leaveUiEmp(Scanner sc) {
				// TODO Auto-generated method stub
				
		}

		private static void changePasswordUiEmp(Scanner sc) {
				// TODO Auto-generated method stub
				
			}

		private static void updateDetailsUiEmp(Scanner sc) {
				// TODO Auto-generated method stub
				
			}

		private static void loginEmpUiEmp(Scanner sc) {
			// TODO Auto-generated method stub
			
		}

		private static void adminLoginUi(Scanner sc) {
		
    	System.out.println("1 - login Dept");
    	System.out.println("2 - add new department");
    	System.out.println("3 - view all department");
    	System.out.println("4 - update department name");
    	System.out.println("5 - register employee");
    	System.out.println("6 - change department of employee");
    	System.out.println("7 - approve or deny leave request");
    	System.out.println("8 - fire employee");
    	System.out.println("9 - logout department");
    	
    	
    	int choice = 0;
    	try {
    		
    	
	    	do {
	    		
	    		choice = sc.nextInt();
	    		switch(choice) {
	    		case 1:
	    			loginDept(sc);
	    			break;
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
	    			logoutDepart (sc);
	    			break;
				
	    			
	    		}
	    		
	    	}while(choice !=0);
    	
    	}catch(DataAlreadyExistException ex) {
    		System.out.println(ex);
    	} catch (WrongCrediancialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void logoutDepart(Scanner sc) {
	// TODO Auto-generated method stub
	
}

	private static void fireEmployee(Scanner sc) {
	// TODO Auto-generated method stub
	
}

	private static void approveOrDenyLeaveRequest(Scanner sc) {
	// TODO Auto-generated method stub
	
}

	private static void changeDepartmentOfEmployee(Scanner sc) {
	// TODO Auto-generated method stub
	
}

	private static void registerEmployee(Scanner sc) {
	// TODO Auto-generated method stub
	
}

	private static void updateDepartment(Scanner sc) {

		
	
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
	
		System.out.println("Enter your username");
		String username = sc.next();
		System.out.println("Enter your password");
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
