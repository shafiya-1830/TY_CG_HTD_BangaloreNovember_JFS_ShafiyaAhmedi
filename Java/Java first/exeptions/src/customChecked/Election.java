package customChecked;

public class Election {

	void vote(int age) throws AgeLimitException
	{
		if(age<18)
		{
			throw new AgeLimitException("Age limit is more than 18yrs");
		}else
		{
			System.out.println("Allowed for voting");
		}
	}
}
