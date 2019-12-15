
public class Demo3 {

	public static void main(String[] args) {
		String s1="John";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		String s2="  John  Mikel  ";
		System.out.println(s2.trim());
		
		String s3=s1.substring(3);
		System.out.println(s3);
		
		String s4="ShafiyaJameela";
		System.out.println(s4.substring(3,6));
		
		System.out.println(s4.isEmpty());
		System.out.println(s4.charAt(4));
		System.out.println(s4.indexOf('h'));
		System.out.println(s4.indexOf("me"));
		System.out.println(s4.indexOf("me", 4));
		System.out.println(s4.indexOf('a', 3));
		
	}
}
