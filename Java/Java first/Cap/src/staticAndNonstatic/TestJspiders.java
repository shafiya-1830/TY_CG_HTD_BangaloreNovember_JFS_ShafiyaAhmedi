package staticAndNonstatic;

public class TestJspiders {
	public static void main(String[] args) {
	
		Jspiders hebbal=new Jspiders();
		hebbal.swipe();
		hebbal.swipe();
		hebbal.swipe();
		Jspiders BTM=new Jspiders();
		BTM.swipe();
		BTM.swipe();
		
		System.out.println("No of hebbal students "+hebbal.branchStudCount);
		System.out.println("No of BTM students " +BTM.branchStudCount);
		System.out.println("Total Jspider students " +Jspiders.totalStudCount);
		
}
}
