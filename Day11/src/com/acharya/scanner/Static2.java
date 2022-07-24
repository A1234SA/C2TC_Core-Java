package com.acharya.scanner;

public class Static2 {
	int rollno;
	String name;
	static String collage="ITS";
	Static2(int r,String n){
		rollno = r;
		name = n;
	}
	static void change() {
		collage = "BBSIT";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+collage);
	}

	public static void main(String[] args) {
		Static2 s1 = new Static2(111,"Soujanya");
		Static2 s2 = new Static2(222,"Bhavana");
		change();
		s1.display();
		s2.display();
	}

}
