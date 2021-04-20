import java.util.Scanner;
public class MaxMin
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

	int n1,n2,n3;        
        System.out.println("Enter first value");
        n1= s.nextInt();
        System.out.println("Enter second value");
        n2= s.nextInt();
        System.out.println("Enter Third value");
        n3= s.nextInt();
	
        if(n1=n2&&n2=n3&&n1=n3)
        {
           
                System.out.println("All are same");
            
           
        }
        else if(n1=n2)
        {
                if(n1>n3){
                        System.out.println("no1 and n2 both are max");
                }
                else{
                        System.out.println("n3 is max");
                }
                
        }
        else if(n1=n3)
        {
                if(n1>n2){
                        System.out.println("no1 and n3 both are max");
                }
                else{
                        System.out.println("n2 is max");
                }
                
        }
        else if(n2=n3)
        {
                if(n2>n1){
                        System.out.println("no3 and n2 both are max");
                }
                else{
                        System.out.println("n1 is max");
                }
                
        }
	
	
    }
}