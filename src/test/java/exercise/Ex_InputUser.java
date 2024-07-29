package exercise;

import java.util.Scanner;



public class Ex_InputUser {

	public static void main(String[] args) {
		
		
		
		Scanner obj = new Scanner(System.in);				//Create a Scanner Object
		

		System.out.println("please enter email: ");
		
		
		String email = obj.nextLine();
		
		
		System.out.println("Email ID: " + email);
		

	}

}
