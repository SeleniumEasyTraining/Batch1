package week2;

public class SwitchStatement {

	public static void main(String[] args) {

		String browserName = "chrome";

		switch(browserName) {
		
		case"chrome" : System.out.println("Launch chrome browser");
		break;
		case"firefox" : System.out.println("Launch firefox browser");
		break;
		case"ie" : System.out.println("Launch ie browser");
		break;
		default : System.out.println("Invalid browser name");
		
		}


	}

}
