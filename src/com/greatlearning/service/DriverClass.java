package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {
	public static void main(String[] args) {
		
		Employee employee = new Employee("harshit", "choudary");
		CredentialService cs = new CredentialService();
		String generateEmail;
		char[]  generatePassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Humen Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		if (option == 1) {
			generateEmail = cs.generateEmailAdress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),  "tech");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
			
		}
		
		else if (option == 2) {
			generateEmail = cs.generateEmailAdress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),  "adm");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
			
		}
		else if (option == 3) {
			generateEmail = cs.generateEmailAdress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),  "hr");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
		}
		
		else if (option == 4) {
			generateEmail = cs.generateEmailAdress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),  "lg");
			generatePassword = cs.generatePassword();
			cs.showCredentials(employee, generateEmail, generatePassword);
			
		}
		
		else 
			System.out.println("Enter a valid option");
		sc.close();
 	}

}
