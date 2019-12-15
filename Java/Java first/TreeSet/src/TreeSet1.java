import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		
		t.add(1);
		t.add(11);
		t.add(9);
		t.add(1);
		
		
		for(Object o:t)
		{
			System.out.println(o);
		}
		
		

	}

}
