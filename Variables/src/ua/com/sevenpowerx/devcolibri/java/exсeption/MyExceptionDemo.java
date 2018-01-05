package ua.com.sevenpowerx.devcolibri.java.exсeption;

public class MyExceptionDemo {
	public static void main(String[] args) {
		try {
			throw new MyException();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
