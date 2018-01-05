package ua.com.sevenpowerx.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("string1");
		set.add("string2");
		set.add("string3");
		
		/*Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		for (String str :
				set) {
			System.out.println(str);
		}
	}
}

