public class Students
{
	//1) Dm's
	int rno;
	String studentName;
	int std;
	static String schoolName;

	public Students() {
		// TODO Auto-generated constructor stub
	}
	//2) Methods
	static {
		Students.schoolName = "CN";
	}
//	public static void setSchoolName(String schoolName)
//	{
//		Student.schoolName = schoolName;
//	}
	public static String getSchoolName() 
	{
		return Students.schoolName;
	}
	public void disp()
	{
		System.out.println(rno+ " " +studentName+ " " +std+ " "  + Students.getSchoolName());
	}
	//3) Constructor
	public Students(int rno, String studentName, int std)
	{
		this.rno=rno;
		this.studentName=studentName;
		this.std=std;
	}
	public Students(int rno, String studentName, int std, String schoolName)
	{
		this.rno=rno;
		this.studentName=studentName;
		this.std=std;
	}
	
}