class Unary
{
public static void main(String[] args)
{
int x=20;
int y=x++ + ++x + x-- + --x + ++x;
System.out.println(y);
}
}