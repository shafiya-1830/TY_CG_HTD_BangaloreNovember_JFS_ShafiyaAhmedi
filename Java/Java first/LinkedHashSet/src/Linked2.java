import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked2 {

	public static void main(String[] args) {

		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		
		l1.add(new Employee("S",22));
		l1.add(new Employee("R",23));
		l1.add(new Employee("R",23));
		
		Iterator<Employee> itr1=l1.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
	}

}
