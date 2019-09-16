package week3;

public class Teacher{
	
	int sal = 10000;
	
}

class Bonus extends Teacher{
	
	int bonus = 2500;
}

class NetSal extends Bonus{
	
	public static void main(String[] args) {
		
		NetSal netSal = new NetSal();
		System.out.print(netSal.sal+netSal.bonus);
		
		
	}
	
}