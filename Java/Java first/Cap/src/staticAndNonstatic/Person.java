package staticAndNonstatic;

public class Person {
	 static int age;
	 String name;
	 
	 public void personDetails()
	 {
		 System.out.println("Name of a person is "+name+" and his/her age is "+age);
		 personDetailsStatic();
	 }
	 
	 public static void personDetailsStatic()
	 {
		 System.out.println("Age is" +age);
	 }
}
