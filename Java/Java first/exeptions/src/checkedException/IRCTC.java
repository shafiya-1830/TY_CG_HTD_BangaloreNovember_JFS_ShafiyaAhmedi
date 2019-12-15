package checkedException;

public class IRCTC {

	void confirmTicket() throws ClassNotFoundException
	{
		try
		{
			Class.forName("checkedException.Paytm");
			System.out.println("ticket is confirmed");
		}catch(ClassNotFoundException e) {
			System.out.println("ticket not confirmed");
			throw e;
		}
	}
}
