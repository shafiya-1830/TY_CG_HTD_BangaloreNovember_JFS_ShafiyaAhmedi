import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestA {

	public static void main(String[] args) {
		System.out.println("---------------Predicate----------");
		Predicate<Integer> p=i->i%2==0;
		boolean b1=p.test(14);
		System.out.println(b1);
		System.out.println(p.test(19));
		
		
		System.out.println("---------------Function------------");
		Function<Integer, Integer> f=i->i*100;
		int a=f.apply(19);
		System.out.println(a);
		
		System.out.println("----------------Supplier------------");
		Supplier<Person> s=()->new Person(22,"sushmitha");
		System.out.println(s.get().getAge());
		System.out.println(s.get().getName());
		
		System.out.println("--------------Consumer----------------");
		Consumer<Person> c=j->{
			System.out.println(j.getAge());
			System.out.println(j.getName());
		};
		
		Person p1=new Person(22,"sushmitha");
		c.accept(p1);
	}

}
