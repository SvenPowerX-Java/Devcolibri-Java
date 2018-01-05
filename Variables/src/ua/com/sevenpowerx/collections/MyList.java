package ua.com.sevenpowerx.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
//		list.add(0);
//		list.add(1);
//		list.add(35);
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(2));
//		System.out.print("List: ");
		/*for (int n :
				list) {
			System.out.print(n + ",");
		}
		list.remove(2);
		System.out.println();
		System.out.print("List: ");
		for (int n :
				list) {
			System.out.print(n + ",");
		}
		*/
		Iterator<Integer> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
	}
	
}
