import java.util.Scanner;
public class Student {
    private int Rno;
    private String Name;
    private int Std;
    Scanner sc=new Scanner(System.in);

    public Student() {
    }

    public Student(int Rno, String Name, int Std) {
        this.Rno = Rno;
        this.Name = Name;
        this.Std = Std;
    }

    public int getRno() {
        return Rno;
    }

    public void setRno(int Rno) {
        this.Rno = Rno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getstd() {
        return Std;
    }

    public void setStd(int Std) {
        this.Std = Std;
    }
    public void scan() 
	{
		System.out.print("Enter Rno : ");
		Rno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name : ");
		Name = sc.nextLine();
		System.out.print("Enter Std : ");
		Std = sc.nextInt();
	}
	public void update() 
	{
        sc.nextLine();
		System.out.print("Enter Name : ");
		Name = sc.nextLine();
		System.out.print("Enter Std : ");
		Std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(Rno + " " + Name + " " + Std);
	}
}