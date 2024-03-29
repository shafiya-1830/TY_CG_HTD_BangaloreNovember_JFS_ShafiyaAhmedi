import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestB {

	public static void main(String[] args) {


		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(13);
		a.add(15);
		a.add(16);
		a.add(19);
		a.add(24);
		a.add(30);
		System.out.println("---------Filter(takes predicate)---------");
		
		List<Integer> l=a.stream().filter(i->i%2==0).collect(Collectors.toList());

		System.out.println(l);
		System.out.println("---------Map/Modify(takes function)-----------------");
		List<Integer> l1=a.stream().map(i->i*100).collect(Collectors.toList());
		System.out.println(l1);
		
		System.out.println("-----------Max value------------------");
		Optional<Integer> a1=a.stream().max((i,j)->i.compareTo(j));
		System.out.println(a1);
		
		System.out.println("-----------Total elements-----------");
		System.out.println(a.stream().count());
		}

}
