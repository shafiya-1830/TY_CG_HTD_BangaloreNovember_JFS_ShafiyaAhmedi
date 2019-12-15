
public class Demo1 {

	public static void main(String[] args) {
		String s1=new String("Shafiya");
		System.out.println(s1.hashCode());
		s1=new String("Rafiya");
		s1=s1.concat("Ahmedi");
		System.out.println(s1.hashCode());
	}
}
