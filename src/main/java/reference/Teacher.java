package reference;

public class Teacher {

	int salary = 15000;
}

class HRA extends Teacher{
	
	int hra = 1000;
}

class DA extends HRA{
	
	int da = 250;
}

class MathsTeacher extends DA{
	
	int bonus = 3500;
}
 
class NetSalary{
	
	public static void main(String[] args) {
		
		MathsTeacher maths = new MathsTeacher();
		
		System.out.println("Net Salary of Maths Teacher is "+(maths.salary+maths.bonus+maths.da+maths.hra));
	}
	
}