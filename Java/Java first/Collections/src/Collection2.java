import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		c.add("sia");
		System.out.println(c);
		
		c.remove("sia");
		System.out.println(c);
		
		System.out.println(c.isEmpty());
		
		c.add("ria");
		System.out.println(c);
		
		System.out.println(c.contains("ria"));
	}
}
