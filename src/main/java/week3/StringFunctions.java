package week3;

public class StringFunctions {

	public static void main(String[] args) {

		String name = "Abdul Rahman";

		/*System.out.println(name);

		// Print name in Uppercase

		System.out.println(name.toUpperCase());

		// Print name in Lowercase

		System.out.println(name.toLowerCase());
		 */
		///System.out.println(name.substring(6));


		//begin from begin index and ends at end index - 1

		///System.out.println(name.substring(9));

		//to delete the space at prefix and suffix		

		System.out.println(name);

		System.out.println(name.trim());

		System.out.println(name.lastIndexOf("a"));

		String empName = "Srini,Reddy";//Srini#Reddy

		System.out.println(empName.substring(0,empName.lastIndexOf(",")));

		System.out.println(name.charAt(8));

		System.out.println(empName.replace(",", "#"));
		
		String firstName = "Thammem";
		
		String lastName = "Ansari";
		
		//String fullName = firstName.concat(lastName);
		
		String fullName = firstName+","+lastName;
		
		System.out.println(fullName);
		
		System.out.println(fullName.contains("#"));
		

	}

}
