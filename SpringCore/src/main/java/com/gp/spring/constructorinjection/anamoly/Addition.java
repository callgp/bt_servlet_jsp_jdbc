package com.gp.spring.constructorinjection.anamoly;

public class Addition {

	Addition(int a, int b){
		System.out.println("in INT method");
	}
	Addition(double a, double b){
		System.out.println("in DOUBLE method");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
	Addition(String a, String b){
		System.out.println("in String method");
	}
	
}
