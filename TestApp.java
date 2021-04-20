import java.util.Scanner;
public class TestApp1
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter first value");
        int n1= s.nextInt();
        System.out.println("Enter second value");
        int n2= s.nextInt();

        int sum =n1+n2;
        int sub = n1-n2;
        int mul=n1*n2;
        int div=n1/n2;

        System.out.println("sum is "+sum);
        System.out.println("sub is "+sub);
        System.out.println("mul is "+mul);
        System.out.println("div is "+div);
    }
}