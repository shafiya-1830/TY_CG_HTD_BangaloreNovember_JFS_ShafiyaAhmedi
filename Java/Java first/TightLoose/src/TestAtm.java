
public class TestAtm {
public static void main(String[] args) {
	Bank b=new Bank();
	Sbi s=new Sbi();
	Hdfc h=new Hdfc();
	Atm a=new Atm();
	
	a.accept(s);
	
}
}