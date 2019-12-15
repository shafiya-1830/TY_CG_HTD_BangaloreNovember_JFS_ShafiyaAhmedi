package customunchecked;

public class ATMSimulation {

	void withDraw(double amount)
	{
		if(amount>40000)
		{
			throw new DayLimitException("User day limit exception");
			
		}
	}
}
