class Elseif
{
public static void main(String[] args)
{
int a=10;
int b=20;
int x=80;
int y=70;
if(a>b && a>x && a>y)
{
System.out.println("a is greater");
}
else if(b>x && b>y)
{
System.out.println("b is greater");
}
else if(x>y)
{
System.out.println("x is greater");
}
else 
{
System.out.println("y is greater");
}
}
}