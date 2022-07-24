package com.acharya.constructor;

public class Employe2 {
	int id;
	String name;
	float salary;
	//Constructor
	Employe2(){
		System.out.println("User defined No-arg constructor is called");
	}
	//User defined parameterized constructor
	public Employe2(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	//Method
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}

	public static void main(String[] args) {
		Employe2 e1 = new Employe2(111,"Anusha",5000f);
	     Employe2 e2 = new Employe2();
	     e1.display();
	     e2.display();
	}

}
