package week4;

public class Encapsulation {

	private static String name ;
	private int id;
	private static String env;
	
	public static String getEnv() {
		return env;
	}
	
	public static void setEnv(String env) {
		Encapsulation.env = env;
	}
	
	public static String getName() {
		return name;
	}
	
	public static void setName(String name) {
		Encapsulation.name = name;
	}
	
}
