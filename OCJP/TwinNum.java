import java.util.Scanner;
public class TwinNum{
    public static void main(String args[])
    {
        int rem,sum=0,mul=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        while(n > 0)
        {
            rem = n % 10;
            sum = sum + rem;
            mul=mul*rem;
            n = n / 10;
        }
        if(sum==mul)
        {
            System.out.println("Twin num");

        }
        else
        {
              System.out.println(" not Twin num");

        }
       
    }
    
}