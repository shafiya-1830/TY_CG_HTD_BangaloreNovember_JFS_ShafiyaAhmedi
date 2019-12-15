
public class TestEmployee {

	public static void main(String[] args) {
		/*
		Employee e1=new Employee(49,"shafiya");
		System.out.println(e1.hashCode());
		Employee e2=new Employee(53,"shafia");
		System.out.println(e2.hashCode());
		System.out.println(e2.toString());
		Object o=new Object();
		System.out.println(o.toString());
		*/
		Employee e1=new Employee(49,"shafiya");
		Employee e2=new Employee(49,"shafiya");
		Employee e3=new Employee(53,"rafiya");
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		
	}
}
