package week3;

public class Parent{

	void printSal() {
		System.out.println("This is from parent");
	}
	
}

class Child extends Parent{
	
	@Override
	void printSal() {
		System.out.println("This is from child");
	}
}

class Child1 extends Parent{
	void printSal() {
		System.out.println("This is from childone");
	}
	
}


class Run {
	
	public static void main(String[] args) {
		Parent pa1 = new Parent();
		Parent pa = new Child1();
		Parent pa2 = new Child();
		
	pa2.printSal();
	pa.printSal();
	pa1.printSal();
	
	}
}