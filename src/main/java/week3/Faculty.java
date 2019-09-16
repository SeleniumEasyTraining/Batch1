package week3;

public class Faculty {
	
	int basicSal = 25000;

}

class ScienceFaculty extends Faculty{
	
	int hra = 5500;
	int netSal = basicSal+hra;
}

class MathsFaculty extends Faculty{
	
	int hra = 3000;
	int netSal = basicSal+hra;
}

class EnglishFaculty extends Faculty{
	
	int hra = 2000;
	int netSal = basicSal+hra;
}

class AllFacSal{
	
	public static void main(String[] args) {
		
		ScienceFaculty sc = new ScienceFaculty();
		System.out.println("The net salary of Science "+sc.netSal);
		MathsFaculty ma = new MathsFaculty();
		System.out.println("The net salary of Science "+ma.netSal);
		EnglishFaculty en = new EnglishFaculty();
		System.out.println("The net salary of Science "+en.netSal);
	}
	
}