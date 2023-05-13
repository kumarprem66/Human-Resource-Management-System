# Human-Resource-Management-System

Developed a Java Based Application to control and manage the data of the Employees and Departments by the Human Resource Department of the companies.

Users of this application:
Admin
Employees


/////////////// ================ ADMIN =============== ///////////////////////


Functionalities of Admin, an admin can:

1. Login with his account.
2. Add new departments using department name and department id
3. View All the departments
4. Update the department name
5. Register a new employee using username, default password & department, salary.
6. You can use email of employee as username. The default password is 123456 for
all employees. The date of joining will taken as system date.
Change department of the employee
7. Approve of deny employee leave request with remark
8. Fire an employee (Delete an employee account)
Logout

/////////////// ================ Employee =============== ///////////////////////

Functionalities of Employee, an Employee can:

1. Login with his account
2. Update his account details and change password
3. Apply for leave
4. Can see the status of leave
5. Can see history of leave
6. Can see the total salary of a month
7. Can see the annual salary of a financial year
8. Delete account
9. Logout




Department                                                                                  
                                                                      
 int id;
 String name;
@OneToMany
Set<Employee> employee;
int isDeleted = 0;


Employee
String email;
String name;
int salary;
String password = "123456";
int isDeleted = 0;
Date joinningDate;
@ManyToOne
Department department;
@OneToMany
Set<EmpLeave> leave;
  
  
  Empleave
  
 private int id;
String status;
String reason;
 int noOfDays;
 int leaveID;
@ManyToOne
Employee employee;

  
  




