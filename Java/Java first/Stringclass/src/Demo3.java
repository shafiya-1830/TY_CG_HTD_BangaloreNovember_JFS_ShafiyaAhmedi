
public class Demo3 {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("shafiya");
		System.out.println(s1.hashCode());
		s1=s1.append("ahmedi");
		System.out.println(s1.hashCode());
	}
}
