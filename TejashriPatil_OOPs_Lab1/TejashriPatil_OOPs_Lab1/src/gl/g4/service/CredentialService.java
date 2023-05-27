package gl.g4.service;

import java.util.Random;

import gl.g4.employee.Employee;

public class CredentialService {
	
	Random random = new Random();
	
	public void generatePassword(Employee employee) {
		
		String password = "";
		String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String characters = "!@#$%^&*";
		

		password += numbers.charAt(random.nextInt(numbers.length()));
		password += numbers.charAt(random.nextInt(numbers.length()));
		password += numbers.charAt(random.nextInt(numbers.length()));
		password += capitals.charAt(random.nextInt(capitals.length()));
		password += characters.charAt(random.nextInt(characters.length()));
		password += small.charAt(random.nextInt(small.length()));
		password += capitals.charAt(random.nextInt(capitals.length()));
		password += capitals.charAt(random.nextInt(capitals.length()));
		
		employee.setPassword(password);
		
	}
	
	public void generateEmailAddress(Employee employee,String department) {
		
		String email = employee.getFirstName() + employee.getLastName() + "@" + department + ".GreatLeraning.com";
		employee.setEmail(email);
		
	}
	
	public void showCredentials(Employee employee) {
		
		System.out.println("Dear " +employee.getFirstName()+ " your generated credentials are as follows");
		System.out.println("Email    --> " +employee.getEmail());
		System.out.println("Password --> " +employee.getPassword());
		
	}
	
}
