package exeptionsClass;

public class ExceptionA {

	void exception(int a,String b)
	{
		try {
			System.out.println(b.length());
			System.out.println(500/a);
			
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}catch(NullPointerException n)
		{
			System.out.println(n.getMessage());
		}
	}
}
