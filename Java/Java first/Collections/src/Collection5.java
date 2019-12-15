import java.util.ArrayList;
import java.util.Collection;

public class Collection5 {

	public static void main(String[] args) {
		
Collection c4=new ArrayList();
		
		c4.add(25);
		c4.add(23);
		c4.add(12);
		c4.add(13);
		
		Object a[]=c4.toArray();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
