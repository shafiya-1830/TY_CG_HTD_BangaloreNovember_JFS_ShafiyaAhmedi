package exeptionsClass;

public class TestExpA {

	public static void main(String[] args) {
		System.out.println("main method started");
		ExceptionA a1=new ExceptionA();
		a1.exception(0, "SHAFU");
		a1.exception(2, null);
		System.out.println("main method ended");
	}
}
