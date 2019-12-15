import java.util.Comparator;

//public class Employee implements Comparable<Employee> {
public class Employee implements Comparator<Employee> {

	int age;
	int sal;
	String name;
	
	
	
	public Employee(int age, int sal, String name) {
		super();
		this.age = age;
		this.sal = sal;
		this.name = name;
	}

	

	
//	@Override
//	public int compareTo(Employee o) {
//		if(this.age>o.age)
//			return 1;
//		else if(this.age<o.age)
//			return -1;
//		else
//		return 0;
//	}
	
//	@Override
//	public int compareTo(Employee o) {
//		if(this.sal>o.sal)
//			return 1;
//		else if(this.sal<o.sal)
//			return -1;
//		else
//		return 0;
//	}
	
	

	@Override
	public String toString() {
		return "Employee [age=" + age + ", sal=" + sal + ", name=" + name + "]";
	}


@Override
public int compare(Employee o1, Employee o2) {
	// TODO Auto-generated method stub
	return 0;
}


	


	
	
	

	
}
