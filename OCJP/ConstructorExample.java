import java.util.Scanner;

public class ConstructorExample
{
    //dm's/instance veriable
    int rno;
    int std;
    String name;
//Default constructor
    public ConstructorExample()
    {
        System.out.println("Start: default constructor");
        rno=1;
        std=12;
        name="ekta";
         System.out.println("Exit: default constructor");
    }
    //para constructor
    public ConstructorExample(int rno,int std,String name)
    {
         System.out.println("Start: para constructor");
         this.rno=rno;
         this.std=std;
         this.name=name;
          System.out.println("Exit: para constructor");
    }
    //COPY con
    public ConstructorExample(ConstructorExample c)
    {
         System.out.println("Start: copy constructor");
          this.rno=c.rno;
          this.std=c.std;
          this.name=c.name;
          System.out.println("Exit: copy constructor");

    }
    void scan()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rno");
        rno=sc.nextInt();
        System.out.println("Enter std");
        std=sc.nextInt();
        System.out.println("Enter Name");
        name=sc.nextLine();

    }
    public void disp()
    {
        System.out.println(rno+" "+std+" "+name);
    }
    public static void main(String[] args)
    {
        System.out.println("Start:: Main Method");
        Scanner sc=new Scanner(System.in);
        ConstructorExample obj1=new ConstructorExample();
        ConstructorExample obj2=new ConstructorExample(2,11,"Heli");

        obj1.disp();
        obj2.disp();

        ConstructorExample obj3=new ConstructorExample(obj2);
        obj3.disp();

        System.out.println("Exit:: Main Method");

    }
}