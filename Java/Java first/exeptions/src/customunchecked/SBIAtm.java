package customunchecked;

public class SBIAtm {

	public static void main(String[] args) {
		System.out.println("main started");
		ATMSimulation a=new ATMSimulation();
		try
		
		{
			a.withDraw(41000);
		}catch(DayLimitException d) {
			System.out.println(d.getMessage()  );
		}
		
		System.out.println("main ended");
	}
}
