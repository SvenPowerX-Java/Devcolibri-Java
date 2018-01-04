package ua.com.sevenpowerx.devcolibri.java.animals;

public class Peopel {
	private String name;
	private String lastName;
	private int age;
	private Cat cat;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Cat getCat() {
		return cat;
	}
	
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	public Peopel() {
		name = "Неизвестный человек";
		lastName = "Неизвестный человек";
		age = 0;
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
}
