package week4;

public class Child extends Parent{

	
	Child(){
		
		System.out.println("Child class");
		super.test();
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		
	}
	
}
