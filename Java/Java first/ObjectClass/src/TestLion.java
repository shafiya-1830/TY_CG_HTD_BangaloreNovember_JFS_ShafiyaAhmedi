
public class TestLion {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	Lion l=new Lion("Ferocious");
	Class c=l.getClass();
	Lion l1=(Lion) c.newInstance();
	System.out.println(c);
	System.out.println(l1.name);
	Class c1=Class.forName("Lion");
	System.out.println(c1);
	Lion l2=(Lion) c1.newInstance();
	System.out.println(l2.name);
	
}
}
