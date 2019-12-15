package exeptionsClass;

public class TestC {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] a=new int[3];
		a[0]=1;
		a[1]=9;
		a[2]=9;
		try
		{
			a[3]=4;
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("main method ended");
	}
}
