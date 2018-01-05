package ua.com.sevenpowerx.devcolibri.java.exсeption;

import java.io.PrintStream;

public class MyException extends Exception {
	@Override
	public void printStackTrace(PrintStream s) {
		System.err.println("It my first exception: ");
	}
}
