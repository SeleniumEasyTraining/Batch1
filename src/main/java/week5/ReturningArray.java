package week5;

public class ReturningArray {


	int[] retArr() {

		int[] arr = new int[5];

		arr[0]=56;
		arr[1] = 34;
		return arr;

	}
	
	String[] strArr() {
		
		String[] str = new String[2];
		
		str[0] = "Rama";
		str[1] = "Laxmi";
		
		return str;
		
	}

	void show(String[] datArr) {

		
		System.out.println(datArr[0]);
		System.out.println(datArr[1]);

	}
	
	


}

class Demo{
	
	
	
	public static void main(String[] args) {
		ReturningArray abc = new ReturningArray();
		abc.show(abc.strArr());
	}
	
	
	
}
