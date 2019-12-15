package exeptionsClass;

public class TestCalc {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Calculator c=new Calculator();
		c.divide(10,0);
		System.out.println("main method ended");
		
	}
}
