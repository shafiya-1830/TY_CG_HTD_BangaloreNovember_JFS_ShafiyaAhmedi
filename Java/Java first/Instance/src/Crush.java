
public class Crush {

	void receive(Phone p)
	{
		if(p instanceof BasicSet)
		{
			System.out.println("thanks");
			
		}
		else if(p instanceof Oppo)
		{
			System.out.println("thank you");
		}
		else if(p instanceof OnePlus)
		{
			System.out.println("thank you so much dear");
		}
		else if(p instanceof Apple)
		{
			System.out.println("Love you");
			
		}
		else
		{
			System.out.println("Rascal");
		}
	}
}
