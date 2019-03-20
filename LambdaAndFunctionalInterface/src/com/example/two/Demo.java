package com.example.two;

public class Demo {
	
	public static void main(String[] args) {
		
		MyInterface i = (a,b) -> System.out.println("sum is = " + (a+b));
		i.doAdd(1, 2);
	}

}
