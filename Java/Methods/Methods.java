class Methods
{
 
static void add(int a,int b)
{
System.out.println(" sum = "+(a+b));
return;
}
static void sub(int a,int b)
{
System.out.println(" difference = "+(a-b));
return;
}
static void mul(int a,int b)
{
System.out.println(" product = "+(a*b));
return;
}
static void div(int a,int b)
{
System.out.println(" By = "+(a/b));
return;
}
static void mod(int a,int b)
{
System.out.println(" rem = "+(a%b));
return;
}
public static void main(String[] args)
{
add(30,70);
sub(10,5);
mul(1,9);
div(20,5);
mod(24,6);

}
}