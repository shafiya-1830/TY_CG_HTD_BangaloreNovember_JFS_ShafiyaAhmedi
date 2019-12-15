class Rectangle
{
 
static double areaRect(int l,int b)
{
double areaRect= l*b;
return areaRect;
}
static double perimeterRect(int l,int b)
{
double perimeterRect= 0.5 * l* b;
return perimeterRect;
}

public static void main(String[] args)
{
double area=areaRect(3,4);
double perimeter=perimeterRect(3,4);
System.out.println(area);
System.out.println(perimeter);
}
}
