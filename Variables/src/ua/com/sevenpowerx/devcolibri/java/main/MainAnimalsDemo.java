package ua.com.sevenpowerx.devcolibri.java.main;

import ua.com.sevenpowerx.devcolibri.java.animals.Cat;
import ua.com.sevenpowerx.devcolibri.java.animals.Peopel;

public class MainAnimalsDemo {
	static Cat cat = new Cat();
	static Peopel peopel = new Peopel();
	
	public static void main(String[] args) {
		cat.setName("Джорж");
		cat.setPoroda("Перситцкий");
		cat.setAge(2);
		
		
		peopel.setName("Alex");
		peopel.setLastName("Lavryniuk");
		peopel.setAge(40);
		peopel.setCat(cat);
		
//		System.out.println(cat.toString());
		System.out.println(peopel);
		peopel.getCat().say();
	}
}
