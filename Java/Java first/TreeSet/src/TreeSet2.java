import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {

		TreeSet<Student> t=new TreeSet<Student>();
		
		t.add(new Student(23,"R"));
		t.add(new Student(22,"S"));
		t.add(new Student(21,"U"));
		
		Iterator<Student> i=t.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

	
}
