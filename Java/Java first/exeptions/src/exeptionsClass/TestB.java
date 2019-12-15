package exeptionsClass;

public class TestB {

	void write()
	{
		String s=null;
		try
		{
			System.out.println("length of string is"+s.length());
		}catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		TestB b=new TestB();
		b.write();
		System.out.println("main method ended");
	}
}
