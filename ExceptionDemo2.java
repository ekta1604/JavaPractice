package exceptiondemo;
import java.util.Scanner;
import java.io.IOException;
public class ExceptionDemo2 {

    int div(int no1, int no2)throws InvalidValue{
        int ans=0;
        if(no2<=0)
        {
            throw new InvalidValue("plz enter positive value for no2");
        }
        else{
            ans=no1/no2;
        }
        return ans;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);

        ExceptionDemo2 obj = new ExceptionDemo2();

        System.out.println("Enter no1:");
        n1=sc.nextInt();
        System.out.println("Enter no2:");
        n2=sc.nextInt();

        int ans=0;

        try{
            ans=obj.div(no1, no2);
        }
        catch(InvalidValue e){
            e.printStackTrace();
        }
        System.out.println("Divison:"+ans);

    }
    
}
