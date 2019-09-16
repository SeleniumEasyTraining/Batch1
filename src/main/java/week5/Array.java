package week5;

public class Array {

	public static void main(String[] args) {

		
		int array[][] = {{43,545,65},{3,6,7}};
		
		
		System.out.println("The length of array is "+array.length);
		
		System.out.println(array[1][1]);
		
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		String[] str = {"mahesh","suresh","ansari"};
		
		System.out.println(str[2]);
		
		
		int arrayz[][] = new int[3][4];
		
		arrayz[0][0] = 21;
		arrayz[0][1] = 59;
		arrayz[0][2] = 89;
		arrayz[0][3] = 65;
		
		arrayz[1][0] = 32;
		
		arrayz[2][3] = 47; 
		
		
		System.out.println(arrayz[2][3]);
		
		
		/*for(int i = 0;i<arrayz.length;i++) {
			System.out.println(arrayz[i]);
		}*/
		
		

				
		
	}

}
