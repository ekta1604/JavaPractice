import java.util.Scanner;
public class menudriven
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,ch;
        System.out.println("1---Addition");
        System.out.println("2---Substraction");
        System.out.println("3---Multiplication");
        System.out.println("4---Divison");

        System.out.println("enter your choice");
        ch=s.nextInt();

          
        System.out.println("Enter first value");
        int n1= s.nextInt();
        System.out.println("Enter second value");
        int n2= s.nextInt();

        switch (ch) {
            case 1:
                System.out.println("addition is"+(n1+n2));
                break;
                case 2:
                System.out.println("substraction is"+(n1-n2));
                break;
                case 3:
                System.out.println("multiplication is"+(n1*n2));
                break;
                case 4:
                System.out.println("divison is"+(n1/n2));
                break;
        
            default:
            System.out.println("Invalid choice");
                break;
        }

    }
}