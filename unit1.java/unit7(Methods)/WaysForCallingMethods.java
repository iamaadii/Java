public class WaysForCallingMethods {

	public static void test() {
		System.out.println("from test()");
	}
	
	public static void main(String[] args) {
		
		test();  //calling by direct method name
		
		WaysForCallingMethods.test(); //calling by class name
		
		WaysForCallingMethods d = new WaysForCallingMethods(); //calling by object reference variable or object creation (method invocation)
		d.test();
	}
}
