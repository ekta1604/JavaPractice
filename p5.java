import java.util.Scanner;
public class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int i= sc.nextInt();
        System.out.println("your value is: "+i);
        if(i%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    
}
