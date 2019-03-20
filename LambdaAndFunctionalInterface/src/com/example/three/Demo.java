package com.example.three;

public class Demo {
	
	public static void main(String[] args) {
		
		MyInterface i = s -> s.length();
		System.out.println("My length is = " + i.getMyLength("hello"));
	}

}
