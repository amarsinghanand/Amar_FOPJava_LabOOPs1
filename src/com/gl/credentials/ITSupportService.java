package com.gl.credentials;

import java.util.Scanner;

public class ITSupportService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***** Welcome to the IT Support Service *****");
		System.out.println("Please enter the employee's first name");
	    String firstName = sc.next();
	    System.out.println("Please enter the employee's last name");
	    String lastName = sc.next();
	    Employee employee = new Employee(firstName.toUpperCase(), lastName.toUpperCase());
	    System.out.println("Please enter the department from the following.");
	    System.out.println(" 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
	    int deptOption = sc.nextInt();
	    CrededentialService cs = new CrededentialService();
	    String department = cs.getDepartment(deptOption);
	    employee.setDepartment(department);
	    cs.showCredetnials(employee);
	    System.out.println("Dear " + employee.getFirstName()+", your generated credentials are as follows");
	    System.out.println("Email: " + employee.getEmail());
	    System.out.println("Password: " + employee.getPassword());	    
	}

}
