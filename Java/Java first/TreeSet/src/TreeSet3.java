import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {

		EmployeeName e=new EmployeeName();
		EmployeeAge e1=new EmployeeAge();
		TreeSet<Employee> t1=new TreeSet<Employee>(e1);
		
		t1.add(new Employee(21,40000,"S"));
		t1.add(new Employee(22,33000,"R"));
		t1.add(new Employee(23,40500,"t"));
		
		for (Employee emp : t1) {
		System.out.println("name: "+emp.name);	
		System.out.println("age: "+emp.age);	
		System.out.println("salary: "+emp.sal);	
		
		}
	}

}
