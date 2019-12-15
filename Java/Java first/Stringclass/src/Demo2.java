
public class Demo2 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Shafiya");
		System.out.println(s1.hashCode());
		s1=s1.append("Ahmedi");
		System.out.println(s1.hashCode());
	}
}
