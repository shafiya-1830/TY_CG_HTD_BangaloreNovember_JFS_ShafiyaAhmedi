
public class InstanceBlock {
final int a;
static final double b;
InstanceBlock(int a)
{

	System.out.println("integer");
}
InstanceBlock()
{
	System.out.println("normal");
}

{
	System.out.println("pyscho");
	this.a=30;
	
	System.out.println(a);
}
static
{
	System.out.println("static");
	b=90.9;
	System.out.println(b);
}
}
