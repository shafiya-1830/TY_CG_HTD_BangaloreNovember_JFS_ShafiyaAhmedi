package javaBeanClass;

public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person();
		
		p.setAge(21);
		p.setName("shafiya");
		
		System.out.println(p.getAge());
		System.out.println(p.getName());
	}
}
