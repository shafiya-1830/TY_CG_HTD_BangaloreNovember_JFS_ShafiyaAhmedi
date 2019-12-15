class Square
{
 
static double areaSq(int l)
{
double areaSq= l*l;
return areaSq;
}
static double perimeterSq(int l)
{
double perimeterSq= 4*l;
return perimeterSq;
}

public static void main(String[] args)
{
double area=areaSq(3);
double perimeter=perimeterSq(4);
System.out.println(area);
System.out.println(perimeter);
}
}
