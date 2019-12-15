class DoWhileLoop
{
public static void main(String[] args)
{
int a=0;
do
{
if(a<=5){
System.out.println("OMG");
a++;
}
else{
System.out.println("This is hell");
break;
}
}while(a<=10);
}
}