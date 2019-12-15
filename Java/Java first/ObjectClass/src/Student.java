
public class Student {

	int studId;
	String studeName;
	public Student(int studId, String studeName) {
		super();
		this.studId = studId;
		this.studeName = studeName;
	}
	
	public String toString()
	{
		return "student id: "+studId+" student name: "+studeName;
	}
}
