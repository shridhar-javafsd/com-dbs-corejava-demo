package com.dbs.corejava.demo.ex;

public class ExDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("End");
	}
}
