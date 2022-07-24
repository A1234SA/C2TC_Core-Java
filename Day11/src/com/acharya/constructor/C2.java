package com.acharya.constructor;

public class C2 {
	A4 obj;
	C2(A4 obj){
		this.obj=obj;
	}
	void display() {
		System.out.println(obj.data);
	}
}
class A4{
	int data=10;
	A4(){
		C2 b = new C2(this);
		b.display();
	}
}	
class Main1{

	public static void main(String[] args) {
		A4 a = new A4();
	}

}
