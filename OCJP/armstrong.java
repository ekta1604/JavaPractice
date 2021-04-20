// import java.util.Scanner;
// public class armstrong
// {
//     public static void main(String args[])
//     {
//         int temp,rem,sum=0,i,counter=0;
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter start num");
//         int start=sc.nextInt();
//         System.out.println("Enter end num");
//         int end=sc.nextInt();

//         for(i=start+1;i<end;i++)
//         {
//             temp=i; 
//             if(temp>0)
//             {
//                 rem=temp%10;
//                 sum=sum+rem*rem*rem;
//                 temp=temp/10;
//             }
//             if(i==sum)
//             {
               
//                     System.out.print("Armstrong numbers betwwen"+start+"and"+end+":");
//                     System.out.print(i+" ");
//                     counter++;
//             }
            
//         }

//     }
// }
public class armstrong
{
    public static void main(String args[])
    {
	int n, i, rem,temp, counter=0;
    System.out.println("Armstron num between 11 and 100000 are:");
	for(i=11; i<100000; i++)
	{
       n = 0;
       temp=i;
	   while(temp>0)
	   {
		rem = temp%10;
		n = n + rem*rem*rem;
		temp = temp/10;
       }     
	   if(i == n)
	   {
		
           System.out.println(i);
		   counter++;
       }
	}
	
    }
}