import java.util.Scanner;
public class FinalBlock {
    public  static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n1,n2,ans=0;

        System.out.println("Enter no1:");
        n1=sc.nextInt();
        System.out.println("Enter no2:");
        n2=sc.nextInt();

        try{
            ans=n1/n2;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println("finally block executed");
        }
        System.out.println("division"+ans);


    }
    
}
