package com.markey.test;

public class ChangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "world!";
		System.out.println(a);
		a = makeChange(a);
		System.out.println(a);
	}
	static String makeChange(String a){
		return a += "hello!";
	}

}
