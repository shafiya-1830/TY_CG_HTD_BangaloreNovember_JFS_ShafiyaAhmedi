import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet hs=new HashSet();
		
		hs.add(1);
		hs.add(9);
		hs.add(11);
		
		
		for (Object o1 : hs) {
			System.out.println(o1);
		}
		
		HashSet<String> hs1=new HashSet<String>();
		
		hs1.add("sia");
		hs1.add("ria");
		hs1.add("tia");
		
		
		for (String s1 : hs1) {
			System.out.println(s1);
		}
	}

}
