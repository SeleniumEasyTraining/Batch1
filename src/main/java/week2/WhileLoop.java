package week2;

public class WhileLoop {

	public static void main(String[] args) {

		int lastNum= 10;
		int sum = 0;


		while(lastNum!=0) {

			sum = sum+lastNum;

			lastNum--;

		}
		System.out.println("Sum="+sum);

	}

}
