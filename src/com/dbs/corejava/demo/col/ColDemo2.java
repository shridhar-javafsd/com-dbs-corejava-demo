package com.dbs.corejava.demo.col;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColDemo2 {

	public static void main(String[] args) {

		System.out.println("Start");

//		typesafety 

		List<Integer> myList = new ArrayList<>(); // Integer
//		ArrayList<Integer> myList = new ArrayList<>(); // Integer
		System.out.println(myList.size());
		myList = new LinkedList<>();
		myList.add(10);
//		myList.add(10.5);
//		myList.add("Abc");
		System.out.println(myList);
		System.out.println(myList.size());
		myList.remove(1);
		System.out.println(myList);
		System.out.println(myList.size());

	}

}
