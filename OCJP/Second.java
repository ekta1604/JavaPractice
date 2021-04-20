import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        if(x == y && y ==z)
            System.out.println("All are same");
        else if(x == y && x > z)
            System.out.println("x and y are max i.e " +x);
        else if(x == z && x > y)
            System.out.println("x and z are max i.e " +z);
        else if(y == z && y > x)
            System.out.println("y and z are max i.e " +y);
        else if(x > y && x > z)
            System.out.println("Largest number is:"+x);
        else if(y > z)
            System.out.println("Largest number is:"+y);
        else
            System.out.println("Largest number is:"+z);
    }
}