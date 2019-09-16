package week3;

public class MethodOverloading {


	void print() {


	}

	void print(int a) {

	}

	void print(String name) {

	}

	void print(double id) {

	}

	void print(double id,String abc) {

	}
	
	void print(double id,String abc,int a) {

	}
	
	void print(double id,int a,String abc) {

	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.print(3.14,"",9);
		
	}

}
