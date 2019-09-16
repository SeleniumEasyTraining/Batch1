package week2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		
		//int count = scan.nextInt();
		
		String name = scan.nextLine();
		
		System.out.println("The name of the person is "+name);
		
	}

}
