
public class Demo {

	public static void main(String[] args) {
		String s1="shafiya";
		String s2="shafiya";
		String s3=new String("shafiya");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
	}
}
