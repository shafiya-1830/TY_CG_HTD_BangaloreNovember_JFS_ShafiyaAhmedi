package nestedTry;

public class ExceptionB {

	void exception(int a,String b)
	{
		try {
			
			System.out.println(500/a);
			try
			{
				System.out.println(b.length());
			}catch(NullPointerException n)
			{
				System.out.println(n.getMessage());
			}
			
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
