package checkedException;

public class ExceptionD {

	public static void main(String[] args) {
		IRCTC i2=new IRCTC();
		System.out.println("main started");
		Paytm p=new Paytm(i2);
		p.bookTicket();
		System.out.println("main ended");
	}
}
