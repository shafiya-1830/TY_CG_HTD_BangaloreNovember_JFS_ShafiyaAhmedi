package exeptionsClass;

public class Calculator {

	
	void divide(int a,int b)
	{
		System.out.println("divide method");
		try
		{
			System.out.println(a/b);	
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
