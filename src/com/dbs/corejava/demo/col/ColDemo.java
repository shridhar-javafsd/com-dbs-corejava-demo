package com.dbs.corejava.demo.col;

import java.util.ArrayList;
import java.util.List;

public class ColDemo {

	public static void main(String[] args) {

		System.out.println("Start");

//		int[] arr = { 10, 20, 30 };

		List myList = new ArrayList();
		System.out.println(myList.size());
		myList.add(10);
		myList.add(10.5);
		myList.add("Abc");
		System.out.println(myList);
		System.out.println(myList.size());
		myList.remove(1);
		System.out.println(myList);
		System.out.println(myList.size());

	}

}
