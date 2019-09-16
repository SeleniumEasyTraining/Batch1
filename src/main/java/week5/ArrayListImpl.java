package week5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImpl {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ansari");
		
		list.add("Suresh");
		
		list.add("Rudresh");
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
			
		}
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
	}
}
