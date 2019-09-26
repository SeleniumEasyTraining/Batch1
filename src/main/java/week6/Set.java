package week6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {


	public static void main(String[] args) {

		//HashSet

		HashSet hashset = new HashSet();
		
		hashset.add("Bangalore");

		hashset.add("Ahamedabad");

		hashset.add("NewDelhi");

		hashset.add("Chennai");
		
		hashset.add("NewDelhi");
		
		hashset.add(12);
		
		hashset.add(null);

		System.out.println(hashset);

		LinkedHashSet linkedhashset = new LinkedHashSet<>();
		
		linkedhashset.add("Bangalore");

		linkedhashset.add("Ahamedabad");

		linkedhashset.add("NewDelhi");

		linkedhashset.add("Chennai");
		
		linkedhashset.add(null);

		System.out.println(linkedhashset);
		
		TreeSet treeset = new TreeSet<>();

		treeset.add("Bangalore");

		treeset.add("Ahamedabad");

		treeset.add("NewDelhi");

		treeset.add("Chennai");
		
		System.out.println(treeset);
		
		Iterator iter = treeset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}



}
