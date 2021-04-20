import java.util.Scanner;

public class Student
{
    int rno,std;
    String name;
	
	void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No : ");
        
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	void display() 
	{
		System.out.println(rno + " " + name + " " + std);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student obj1 = new Student();
		obj1.scan();
		Student obj2 = new Student();
        obj2.scan();

		obj1.display();
		obj2.display();
	}
}