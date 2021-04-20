import java.util.Scanner;
public class ExceptionDemo1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        System.out.println("enter no1");
        int no1 = sc.nextInt();
        System.out.println("enter no2");
        int no2 = sc.nextInt();
        String name = "test";
		int a[] = new int[5];
        try{
        try{
             ans=no1/no2;
        }

        catch(Exception e)
        {
            e.printStackTrace();   
        }
        try{
            System.out.println("statement----test");
        }
        catch(Exception e)
        {
            e.printStackTrace();   
        }
        try {
				
            System.out.println("Name.length() - " + name.length());
        } catch (Exception e) 
        {
            e.printStackTrace();
            
        }
        try {
            a[5]  = 10;
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    catch(NullPointerException|ArithmeticException e)
    {
        
        e.printStackTrace();
    }
    catch (Exception e) 
	{
			e.printStackTrace();
	}

		System.out.println("Division: " + ans);
               
    }
    
}
