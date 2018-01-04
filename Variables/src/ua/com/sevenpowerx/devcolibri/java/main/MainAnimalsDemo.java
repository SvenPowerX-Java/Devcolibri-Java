package ua.com.sevenpowerx.devcolibri.java.main;

import ua.com.sevenpowerx.devcolibri.java.animals.Cat;
import ua.com.sevenpowerx.devcolibri.java.animals.Peopel;

public class MainAnimalsDemo {
	static Cat cat = new Cat();
	static Peopel peopel = new Peopel();
	
	public static void main(String[] args) {
		cat.name = "Джорж";
		cat.poroda = "Перситцкий";
		cat.age = 2;
		
		
		peopel.name = "Alex";
		peopel.lastName = "Lavryniuk";
		peopel.age = 40;
		peopel.cat = cat;
		
//		System.out.println(cat.toString());
		System.out.println(peopel);
		peopel.cat.say();
	}
}
