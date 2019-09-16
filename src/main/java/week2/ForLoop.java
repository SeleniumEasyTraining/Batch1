package week2;

public class ForLoop {

	public static void main(String[] args) {

//		for(int i =5;i>=1;i--) {
//			
//			System.out.print(i);
//		}
		
		/*12345
		12345
		12345
		12345
		12345*/
		
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				
				System.out.print(j); //12345
			}
			System.out.println();
		}*/
		
		/*54321
		54321
		54321
		54321
		54321*/
		
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}


