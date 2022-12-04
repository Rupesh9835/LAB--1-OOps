package com.greatlearning.corejava;

import java.util.Random;

public class CredentialService {
	
//Password generation for the employee
	
	char[] generatePassword() {
		int length = 8;
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] generatePassword = new char[length];
		generatePassword[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		generatePassword[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		generatePassword[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		generatePassword[3] = numbers.charAt(random.nextInt(numbers.length()));
		for (int i = 4; i < length; i++) {
			generatePassword[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return generatePassword;
	}
	
//Email generation for the employee
	
	void generateEmailAddress(String firstName, String lastName, String department) {
		System.out.println("\nEmail   ---->" + firstName + lastName + "@" + department + ".gl.com");
	}
	
//Display Credential for the employee
	
	void showCredentials(String firstName, String lastName, String department) {
		System.out.println("\nDear " + firstName + " " + lastName + " your generated credentials are as follws");
		generateEmailAddress(firstName, lastName, department);
		String password = String.valueOf(generatePassword());
		System.out.println("\nPassword   --->" + password);
	}
}
