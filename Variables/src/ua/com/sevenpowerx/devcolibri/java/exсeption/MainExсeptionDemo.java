package ua.com.sevenpowerx.devcolibri.java.exсeption;

public class MainExсeptionDemo {
	public static void main(String[] args) {
		String[] strings = new String[2];
		try {
			
			System.out.println(strings[5]);
//		} catch (ArrayIndexOutOfBoundsException e) {
		} catch (Throwable e) {
//			e.printStackTrace();
			System.out.println("e = " + e);
			System.out.println("MainExсeptionDemo.main");
			System.out.print("Элемент массива по данному индексу не существует!");
		}
	}
}
