package accessModifiers;

public class Privateaccess {
private String name;
Privateaccess(String name)
{
	this.name=name;
	System.out.println(this.name);
}
private void person()
{
	System.out.println("private method");
}
}
