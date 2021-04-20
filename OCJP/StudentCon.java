import java.util.Scanner;

public class StudentCon {
	// 1) Dm's / Instance Variable
	int rno;
	String name;
	int std;

	// 2) Default Constructor
	public StudentCon() {
		System.out.println("START :: Default Constructor");
		rno = 1;
		name = "Ekta";
		std = 12;
		System.out.println("EXIT :: Default Constructor");
	}

	// 3) Para Constructor
	public StudentCon(int rno, String name, int std) {
		System.out.println("START :: PARA Constructor");
		this.rno = rno;
		this.name = name;
		this.std = std;
		System.out.println("EXIT :: PARA Constructor");
	}

	// 4) COPY Constructor
	public StudentCon(StudentCon s) 
	{
		System.out.println("START :: COPY Constructor");
		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		System.out.println("EXIT :: COPY Constructor");
	}

	// 3) Member Function
	void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}

	public void display() {
		System.out.println(rno + " " + name + " " + std);
	}

	public static void main(String[] args) {
		System.out.println("START :: Main Method");
		Scanner sc = new Scanner(System.in);
		StudentCon obj1 = new StudentCon();
		StudentCon obj2 = new StudentCon(2, "Ankur", 10);
		obj1.display();
		obj2.display();

		StudentCon obj3 = new StudentCon(obj2);
		obj3.display();
		
		System.out.println("EXIT :: Main Method");
	}

}