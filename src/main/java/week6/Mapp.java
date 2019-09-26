package week6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapp {

	public static void main(String[] args) {

		//HashMap

		TreeMap<String,String> hashmap = new TreeMap<String,String>();

	//1 .	
		hashmap.put("empName", "GajjalaReddy");

	//2.	
		hashmap.put("empID", "324");

	//3.	
		hashmap.put("empSalary","");
//4.
		//hashmap.put(null, null);
		
		System.out.println(hashmap);

		//System.out.println(hashmap.get("empID"));

		/*HashMap<String,String> paytm = new HashMap<>();

		paytm.put("username", "abc@gmail.com");

		paytm.put("password", "63551");

		String username = 	paytm.get("username");

		String password = paytm.get("password");

		System.out.println("The username is "+username+" and password is "+password);


		for(HashMap.Entry<String,String> entry: hashmap.entrySet()) {

			System.out.println("Key : "+entry.getKey());	

			System.out.println("Value : "+entry.getValue());

		}*/


		//System.out.println("Before removing : "+hashmap);

		//System.out.println(hashmap.get("empName"));

		//hashmap.remove("empSalary");

		//System.out.println("Afer removing : "+hashmap);

		//hashmap.clear();

		///System.out.println("Afer clearing : "+hashmap);


		/*LinkedHashMap linkedHashmap = new LinkedHashMap<>();

		linkedHashmap.put("empName", "GajjalaReddy");

		linkedHashmap.put("empID", 324);

		linkedHashmap.put("empSalary", "7.5LPA");

		System.out.println(linkedHashmap);

		System.out.println(linkedHashmap.get("empSalary"));

		TreeMap treeMap = new TreeMap();

		treeMap.put(10, "GajjalaReddy");

		treeMap.put(7, 324);

		treeMap.put(8, "7.5LPA");

		System.out.println(treeMap);*/




	}	


}
