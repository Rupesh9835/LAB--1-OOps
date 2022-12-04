package com.greatlearning.corejava;

import java.util.Scanner;

class Employee {

	String firstName;
	String lastName;

	Employee(String firstName, String lastNmae) {

	}
}

public class Main extends CredentialService {
	public static void main(String[] args) {

		String department;
		int num;
		Scanner input = new Scanner(System.in);
		Main m = new Main();

		System.out.println("Please enter First name");
		String firstName = input.next();

		System.out.println("Please enter Last name");
		String lastName = input.next();

		new Employee(firstName, lastName);

		do {
			System.out.println(
					"\nPlease enter the department from the following :\n1.Technical\n2.Admin\n3.Human Resources\n4.Legal");

			num = input.nextInt();

			switch (num) {
			case 1:
				department = "Technical";
				m.showCredentials(firstName, lastName, department);
				break;

			case 2:
				department = "Administration";
				m.showCredentials(firstName, lastName, department);
				break;

			case 3:
				department = "Human_Resource";
				m.showCredentials(firstName, lastName, department);
				break;

			case 4:
				department = "Legal";
				m.showCredentials(firstName, lastName, department);
				break;

			case 100:
				System.exit(num);

			default:
				System.out.println("Please enter valid department number from 1 to 4");
				System.out.println("To exit from the program please enter 100");
				break;
			}
		} while (num > 4 || num <= 0);
		input.close();
	}

}
