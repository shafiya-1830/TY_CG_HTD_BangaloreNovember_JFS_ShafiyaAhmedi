
public class Constructor {

	String name;
	int age;
	double sal;
	
	Constructor(String n,int a,double s)
	{
		name=n;
		age=a;
		sal=s;
		
	}
	void details()
	{
		System.out.println("name= "+name+" age= "+age+" salary= "+sal);
	}
}
