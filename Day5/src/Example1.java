
public class Example1 {
	int weight;
	}
	class Weight{

	public static void main(String[] args) {
		Example1 a1 = new Example1();
		Example1 a2 = new Example1();
		a1.weight = 1;
		a1.weight = 2;
		a2 = a1;
		System.out.println(a2.weight);

	}

}
