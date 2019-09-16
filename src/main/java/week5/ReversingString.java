package week5;

public class ReversingString {
		
	//nahkunir
	public static void main(String[] args) {
		
		String name = "rinu khan";
		
		name = name.replace(" ", "");
		
		String[] chr = name.split("");
		
		int size = chr.length;
		
		for(int i = (size-1);i>=0;i--) {
			
			System.out.print(chr[i]);
		}
		
		
	}
	
	

}
