package checkedException;

public class ExceptionB {

	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println("main started");
		try {
			
	
		Object o1=s1.clone();
		System.out.println("clone executed");
		Class c1=Class.forName("checkedException.Student");
		}catch(CloneNotSupportedException c)
		{
			System.out.println("clone not supported");
		}catch(ClassNotFoundException n)
		{
			System.out.println("class not found");
		}
		System.out.println("main ended");
	}
}
