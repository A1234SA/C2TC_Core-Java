package com.acharya.thiskey;

public class Student4 {
	Student4(){
		this(5);
		System.out.println("hello");
	}
	Student4(int x){
		System.out.println(x);
	}


	public static void main(String[] args) {
		Student4 a = new Student4();
	}

}
