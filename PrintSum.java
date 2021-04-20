import java.util.Scanner;
class PrintSumm{
    int calsum(int n)
    {
        int a=0;
        for(int i=0;i<n;i++)
        {
            if((i%3)==0)
            {
                a+=i;
            }
        }
        return a;
    }
}
public class PrintSum{
     public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
         PrintSumm s=new PrintSumm();

         int a=0;
        
         System.out.println("Enter n: ");
         int n=sc.nextInt();

         a=s.calsum(n);

         System.out.println("sum is "+a);
        
    }
}
