package com.example.one;

public class Demo {
	
	public static void main(String[] args) {
		
		MyInterface i = () -> System.out.println("Hello from Lambda");
		i.myMessage();
	}

}
