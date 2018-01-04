package ua.com.sevenpowerx.devcolibri.java.animals;

public class Cat {
	public String name;
	public int age;
	public String poroda;
	
	public void say() {
		System.out.println("Мяу!");
	}
	
	
	@Override
	public String toString() {
		return "Кот:[\n" +
					"   Имя " + name +",\n" +
					"   Возраст " + age +",\n" +
					"   Порода " + poroda +".]\n";
	}
}

