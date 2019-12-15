package staticAndNonstatic;

public class TestGen {
public static void main(String[] args) {
	/*FirstGen f=new FirstGen();
	System.out.println();
	System.out.println("First gen");
	f.call();
	f.msg();
	
	SecGen s=new SecGen();
	System.out.println();
	System.out.println("second gen");
	s.call();
	s.msg();
	s.radio();
	
	ThirdGen t=new ThirdGen();
	System.out.println();
	System.out.println("third gen");
	t.call();t.msg();
	t.radio();
	t.camera();*/
	
	FirstGen fg=new SecGen();
	fg.call();
	fg.msg();

	FirstGen fg1=new ThirdGen();
	fg1.call();
	fg1.msg();
	
	SecGen sg=new ThirdGen();
	sg.call();
	sg.msg();
	sg.radio();
	
	
	
	
}
}
