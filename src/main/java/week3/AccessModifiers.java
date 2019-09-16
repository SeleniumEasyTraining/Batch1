package week3;

public class AccessModifiers {
	
	protected void getName() {
		System.out.println("My name is james bond");
	}
	
	public static void main(String[] args) {
		AccessModifiers ac = new AccessModifiers();
		
		ac.getName();
	}
	
}
