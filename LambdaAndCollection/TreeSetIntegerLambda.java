package com.example.TreeSetInteger;

import java.util.HashMap;
import java.util.TreeSet;

public class TreeSetIntegerLambda {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> mytree = new TreeSet<Integer>();
		mytree.add(10);
		mytree.add(2);
		mytree.add(5);
		mytree.add(13);
		System.out.println("mytree - natural sort order ascend");
		System.out.println(mytree);
		
		
		TreeSet<Integer> mytree1 = new TreeSet<Integer>(
					(i1,i2) -> i2-i1
				);
		mytree1.add(10);
		mytree1.add(2);
		mytree1.add(5);
		mytree1.add(13);
		System.out.println("mytree1 - custom descending order");
		System.out.println(mytree1);
	}

}
