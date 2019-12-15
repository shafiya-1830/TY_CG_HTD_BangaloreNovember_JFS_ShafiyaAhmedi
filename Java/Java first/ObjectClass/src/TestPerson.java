
public class TestPerson {

	public static void main(String[] args) throws Throwable {
		System.out.println("main method started");
		Person p=new Person("shafiya");
		p.finalize();
		p=null;
		System.gc();
		System.out.println("main method ended");
	}
}
