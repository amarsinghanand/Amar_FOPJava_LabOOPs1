package com.gl.credentials;

import java.util.Random;

public class CrededentialService {
	private String companyName = ".abc.com";

	public String getDepartment(int deptOption) {
		if (deptOption == 1)
			return "Technical";
		else if (deptOption == 2)
			return "Admin";
		else if (deptOption == 3)
			return "Human Resource";
		else 			
			return "Legal";
	}

	public void showCredetnials(Employee employee) {
		String email = generateEmailAddress(employee);
		employee.setEmail(email);
		String password = generatePassword();
		employee.setPassword(password);
	}

	private String generateEmailAddress(Employee employee) {
		return employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@"
				+ employee.getDepartment().toLowerCase().substring(0, 4) + companyName;
	}

	private String generatePassword() {
		int length = 8;
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String passwordChars = numbers + capitalLetters + smallLetters + specialCharacters;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = smallLetters.charAt(random.nextInt(smallLetters.length()));
		password[1] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 4; i < length; i++) {
			password[i] = passwordChars.charAt(random.nextInt(passwordChars.length()));
		}
		return String.valueOf(password);
	}
}
