
public class TestDemo5 {

	public static void main(String[] args) {
		Demo5 d1=new Demo5(21,"shafiya");
		System.out.println(d1.hashCode());
		d1=new Demo5(22,"sia");
		System.out.println(d1.hashCode());
		
		int age=d1.getAge();
		System.out.println(age);
		
		String name=d1.getName();
		System.out.println(name);

		
	}
}
