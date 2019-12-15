package customChecked;

public class AgeLimitException extends Exception{

	String msg;

	public AgeLimitException() {
		super();
	}

	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage()
	{
		return msg;
		
	}
}
