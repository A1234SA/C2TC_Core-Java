
public class InitializeObj1 {
	int rollno;
	String name;
	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}
	void displayInformation() {
		System.out.println(rollno+" "+name);
	}
}
class Student{

	public static void main(String[] args) {
		InitializeObj1 s1 = new InitializeObj1();
		InitializeObj1 s2 = new InitializeObj1();
		s1.insertRecord(111, "Anusha");
	    s2.insertRecord(222, "Prasanna");
	    s1.displayInformation();
	    s2.displayInformation();

	}

}
