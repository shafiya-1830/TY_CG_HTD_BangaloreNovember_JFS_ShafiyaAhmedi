package checkedException;

public class A {

	public static void main(String[] args) {
		System.out.println("main started");
		try
		{
			B.m();
		}catch(ClassNotFoundException e)
		{
			System.out.println("class nt found");
		}
		System.out.println("main ended");
		
	}
}
