
public class CcallChain {

	String a;
	double b;
	int c;
	
	CcallChain()
	{
		this("M",19);
		System.out.println("A");
	}
	
	CcallChain(String a,double b)
	{
		System.out.println("B");
	}
	
	CcallChain(int c)
	{
		this();
		System.out.println("C");
	}
}
