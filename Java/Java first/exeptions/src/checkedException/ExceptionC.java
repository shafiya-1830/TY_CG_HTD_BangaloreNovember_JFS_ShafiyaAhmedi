package checkedException;

public class ExceptionC {

	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println("main started");
		try
		{
			Object o1=e1.clone();
			try
			{
				Class c1=Class.forName("checkedException.Employee");
				System.out.println("class found");
			}catch(ClassNotFoundException e)
			{
				System.out.println("class not found");
			}
		}catch(CloneNotSupportedException n)
		{
			System.out.println("clone not supported");
		}
		System.out.println("main ended");
		
		
		
	}
}
