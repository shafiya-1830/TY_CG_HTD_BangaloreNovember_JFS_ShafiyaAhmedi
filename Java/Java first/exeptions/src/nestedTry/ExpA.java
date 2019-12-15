package nestedTry;

public class ExpA {

	void exp(int a)
	{
		try
		{
			System.out.println(10/a);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}finally
		{
			System.out.println("finally block executed");
		}
	}
}
