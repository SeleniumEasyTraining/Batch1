package week5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLDataException;

public class ExceptionsHandling {

	public static void main(String[] args) {

		int a=5;

		try {
			System.out.println(a/0);
		}catch(Exception e) {
			System.out.println("Do not try dividing any number with zero");
		}

		int[] arr = new int[2];


		try {

			System.out.println("Db connection");

		}catch(ArithmeticException abc) {
			
			System.out.println("Arithmetic exceptiuon occurs");
			
		}catch(NullPointerException e) {
			
			System.out.println("Null pointer exception occurs");
		}
		finally {

			System.out.println("close the coneection");
			System.out.println("Finally will excute");
		}



	}

}
