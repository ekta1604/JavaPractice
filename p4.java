import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        Scanner sss=new Scanner(System.in);
        System.out.println("enter a: ");
        int a= sss.nextInt();
        System.out.println("value of a is "+a);
        System.out.println("enter b: ");
        int b= sss.nextInt();
        System.out.println("value of b is "+b);
        int tmp = a;
             a=b;
             b=tmp;
        System.out.println("new value of a is "+a);
        System.out.println("new value of b is "+b);


    }
    
}
