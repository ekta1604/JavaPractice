import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int n,counter=0;
        int primeNumbers=0;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number till you want prime numbers:");
        n = s.nextInt();
        
        for (int i = 1;i <= n;i++){

                 int no=i;
                 for (int j = 2;j <= no / 2;j++){

                if (no% j == 0){
                   counter++;
                } 
                 if (counter==2){
                     primeNumbers++;
                     System.out.print(no + " "); 
                 }
            }
        }
     System.out.println( "total"+primeNumbers );
    }
}
   