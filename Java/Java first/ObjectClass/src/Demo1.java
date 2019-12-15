
public class Demo1 {

	public static void main(String[] args) {
		String s1="shafiya";
		System.out.println(s1.hashCode());
		String s2="sia";
		s1="ria";
		System.out.println(s1.hashCode());
		String s3="shafiya";
		System.out.println(s3.hashCode());
		
	}
}
