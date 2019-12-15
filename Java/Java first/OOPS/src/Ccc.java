
public class Ccc extends CcallChain {

	Ccc()
	{
			this("S");
			System.out.println("D");
		
	}
	
	Ccc(String a)
	{		
			super(10);
			System.out.println("E");
		
	}
	
	Ccc(int c,double b)
	{
			this();
			System.out.println("F");
		
	}
}
