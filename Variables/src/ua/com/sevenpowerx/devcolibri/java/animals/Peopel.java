package ua.com.sevenpowerx.devcolibri.java.animals;

public class Peopel {
	public String name;
	public String lastName;
	public int age;
	public Cat cat;
	
	
	
	public Peopel() {
		name = "Неизвестный человек";
		lastName = "Неизвестный человек";
		age = 0;
	}
	
	@Override
	public String toString() {
		 String str = "Pople[\n" +
				"   Имя: " + name + ",\n" +
				"   Фамилия:" + lastName + ",\n" +
				"   Возраст:" + age + ".]\n";
//		 if(cat != null)
			 str += cat;
		 return str;
	}
	
	public Peopel(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Peopel(String name, String lastName, int age, Cat cat) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.cat = cat;
	}
}
