
public class Calci {

	int add(int a)
	{
		return a+a;
		
	}
	int add(int a,int b)
	{
		return a+b;
		
	}
	double add(double a)
	{
		return a+a;
		
	}
	//static and non-static overloading
	static int mul(int a)
	{
		return a*a;
	}
	int mul(int a,int b)
	{
		return a*b;
	}
	
	//static overloading
	
	static void sub(int a)
	{
		System.out.println(a-a);
	}
	
	static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	
	static void sub(double a)
	{
		System.out.println(2*a-a);
	}
	
	
}
