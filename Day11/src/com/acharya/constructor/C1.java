package com.acharya.constructor;

public class C1 {
	void m(C1 a) {
		System.out.println("method is invoked");
	}
	void p() {
		m(this);
	}
class Main{

	public static void main(String[] args) {
		C1 s1 = new C1();
		s1.p();

	}
	}

}
