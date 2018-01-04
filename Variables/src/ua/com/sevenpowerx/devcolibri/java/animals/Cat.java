package ua.com.sevenpowerx.devcolibri.java.animals;

public class Cat {
	private String name;
	private int age;
	private String poroda;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPoroda() {
		return poroda;
	}
	
	public void setPoroda(String poroda) {
		this.poroda = poroda;
	}
	
	public  void say() {
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

