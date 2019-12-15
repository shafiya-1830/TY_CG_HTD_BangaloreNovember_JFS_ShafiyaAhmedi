
public class TestCalci {

public static void main(String[] args) {
	Calci c=new Calci();
	int r1=c.add(13);
	System.out.println(r1);
	int r2=c.add(13,19);
	System.out.println(r2);
	double r3=c.add(19.19);
	System.out.println(r3);
	
	int r4=Calci.mul(12);
	System.out.println(r4);
	
	int r5=c.mul(12, 5);
	System.out.println(r5);
	
	Calci.sub(10);
	Calci.sub(10,6);
	Calci.sub(10.0);
	
	
	
}
}
