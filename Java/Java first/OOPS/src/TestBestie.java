
public class TestBestie {
public static void main(String[] args) {
	BestieCon b=new BestieCon();
	System.out.println(b.name);
	System.out.println(b.company);
	System.out.println(b.salary);
	
	BestieCon b1=new BestieCon("Anoo","zucitech",24000.00);
	System.out.println(b1.name);
	System.out.println(b1.company);
	System.out.println(b1.salary);
	
}
}
