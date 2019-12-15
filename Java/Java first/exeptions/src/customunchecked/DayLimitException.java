package customunchecked;

public class DayLimitException extends RuntimeException {
	
	String msg="Exceeds day limit";
	DayLimitException()
	{
		
	}
	
 	DayLimitException(String msg)
	{
		this.msg=msg;
	}
	
	public String getMessage()
	{
		return this.msg;
	}

}
