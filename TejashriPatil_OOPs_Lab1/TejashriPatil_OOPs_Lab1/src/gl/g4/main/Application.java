package gl.g4.main;

import java.util.Scanner;

import gl.g4.employee.Employee;
import gl.g4.service.CredentialService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Employee employee = new Employee("Nikeeta", "Sirvi");
		CredentialService credentials = new CredentialService();
		
		while(true) {
			
			System.out.println("please enter the department from the following");
			System.out.println("1: Technical");
			System.out.println("2: Admin");
			System.out.println("3: Human Resource");
			System.out.println("4: Legal");
			int option = input.nextInt();
		
			switch(option) {
			
				case 1:{
					credentials.generateEmailAddress(employee, "Technical");
					credentials.generatePassword(employee);
					credentials.showCredentials(employee);
					break;
				}
				case 2:{
					credentials.generateEmailAddress(employee, "Admin");
					credentials.generatePassword(employee);
					credentials.showCredentials(employee);
					break;
				}
				case 3:{
					credentials.generateEmailAddress(employee, "Human Resource");
					credentials.generatePassword(employee);
					credentials.showCredentials(employee);
					break;
				}
				case 4:{
					credentials.generateEmailAddress(employee, "Legal");
					credentials.generatePassword(employee);
					credentials.showCredentials(employee);
					break;
				}
				default:{
					System.out.println("please enter the correct option\n");
					continue;
				}
				
			}
			break;
			
		}

		input.close();
		
	}
}
