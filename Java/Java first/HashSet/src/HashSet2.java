import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {

		HashSet<Student> h1=new HashSet<Student>();
		h1.add(new Student("sia",22));
		h1.add(new Student("ria",23));
		h1.add(new Student("tia",24));
		h1.add(new Student("sia",22));
		
		for(Student s:h1)
		{
			System.out.println(s.name +" age is "+s.age);
		}
		
	}

}
