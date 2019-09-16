package week3;

public class JavaConstructor {

	
	long username;
	String usernametring;


	JavaConstructor(long mobilenumber){

		username = mobilenumber;
		
		System.out.println("Logged with mobilenumber");

	}

	JavaConstructor(String emailID){
		
		usernametring = emailID;

		System.out.println("Logged with email id");

	}

	void display(){

		System.out.println(username);
		System.out.println(usernametring);
	}

}

class Demo{


	public static void main(String[] args) {

		
		JavaConstructor javaConst = new JavaConstructor("Pratheep@gmail.com");  //"Pratheep@gmail.com" //9876543210L
		
		javaConst.display();

	}
}

