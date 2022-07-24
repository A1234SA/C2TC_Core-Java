
public class InitializeObj3 {

	public static void main(String[] args) {
		InitializeObj3 obj = new InitializeObj3();
		obj.start();
	}
    void start() {
    	String stra = "do";
    	String strb = method(stra);
    	System.out.println(": "+stra+strb);
    }
    String method(String stra) {
    	stra = stra + "goog";
    	System.out.println(stra);
    	return "good";

	}

}
