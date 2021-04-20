import java.util.Scanner;
public class Employee
{
    int eid,esal;
    String ename,edsgn;
    void scan()
        {
            Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter EmployeeID");
            eid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Employee Name");
            ename=sc.nextLine();
            System.out.println("Enter Employee Salaory");
            esal=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Employee designation");
            edsgn=sc.nextLine();

        }
        void display()
        {
            System.out.println(eid+" "+ename+" "+esal+" "+edsgn);
        }

    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       Employee obj1=new Employee();
       obj1.scan();
       Employee obj2=new Employee();
       obj2.scan();
       Employee obj3=new Employee();
       obj3.scan();
       Employee obj4=new Employee();
       obj4.scan();
       Employee obj5=new Employee();
       obj5.scan();


       obj1.display();
       obj2.display();
       obj3.display();
       obj4.display();
       obj5.display();
       
    }
}

