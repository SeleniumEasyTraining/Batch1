package week2;

public class TernaryOperator {

	public static void main(String[] args) {
		
	//Ternary operator
		
		int a = 15;
		int b = 10;
		
		int c;
		
		c= a>b ? a : b;
		
		System.out.println(c);
		
		boolean sts= a % 2 ==0?true:false;
		
		if(sts) {
			System.out.println("The number is even");
		}else{
			System.out.println("The number is odd");
		}
		
		
	}
	
}
