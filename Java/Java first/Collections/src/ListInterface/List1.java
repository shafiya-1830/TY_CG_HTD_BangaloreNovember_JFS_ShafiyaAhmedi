package ListInterface;


import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {

		List l1=new ArrayList();
		l1.add(0,1);
		l1.add(1,9);
		l1.add(2,19);
		l1.add(3,29);
		l1.add(1,39);
		System.out.println(l1);
		
		l1.remove(2);
		System.out.println(l1);
		
		System.out.println(l1.indexOf(29));
		
		l1.add(39);
		System.out.println(l1.lastIndexOf(39));
		
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
				
		
		
	}

}
