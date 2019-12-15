
public class Demo2 {
public static void main(String[] args) {
	String s1=new String("shafiya");
	System.out.println(s1.hashCode());
	String s2=new String("sia");
	String s3=new String("shafiya");
	s1=new String("ria");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
}
}
