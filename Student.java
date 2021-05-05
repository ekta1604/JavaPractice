public class Student implements Comparable<Student> 
{
	private int rno;
	private String name;
	private int std;

	public Student() {

	}

	public Student(int rno, String name, int std) {
		this.rno = rno;
		this.name = name;
		this.std = std;
	}

	public void disp() {
		System.out.println(rno + " " + name + " " + std);
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return rno + " " + name + " " + std;
	}
    public int compareTo(Student s) 
	{
		if(std > s.std) 
		{
			return 1;
		}else if(std < s.std) 
		{
			return -1;
		}else 
		{
			return 0;
		}
	}
}
   