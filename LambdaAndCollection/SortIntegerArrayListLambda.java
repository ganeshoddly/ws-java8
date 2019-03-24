package com.example.ArrayListInteger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntegerArrayListLambda {
	
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(20);
		myList.add(10);
		myList.add(30);
		myList.add(25);
		System.out.println("before sorting");
		System.out.println(myList);
		
		System.out.println("after sorting with lambda");
		
		Collections.sort(myList, (i1,i2) -> i1-i2);//ascend
		//Collections.sort(myList, (i1,i2) -> i2-i1); //descend
		System.out.println(myList);
	}

}
