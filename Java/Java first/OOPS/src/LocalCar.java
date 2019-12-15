
public class LocalCar extends LocalVehicle {

	int cost=56000;
	void carDetails()
	{
		int cost=15000;
		System.out.println("local cost= "+cost);
		System.out.println("this cost= "+this.cost);
		System.out.println("super cost= "+super.cost);
		
		
	}
}
