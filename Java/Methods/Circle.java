class Circle
{
 
static double areaCir(int r)
{
double areaCircle= 3.142 * r *r;
return areaCircle;
}
static double circumference(int r)
{
double circumference= 2 *3.142 *r;
return circumference;
}

public static void main(String[] args)
{
double area=areaCir(6);
double circum=circumference(3);
System.out.println(area);
System.out.println(circum);
}
}
