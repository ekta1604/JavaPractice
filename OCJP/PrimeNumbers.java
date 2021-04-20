public class PrimeNumbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int n=0;
       String  primeNumbers = "";

       for (i = 1; i <= 1000; i++)         
       { 		  	  
          int counter=0; 	  
          for(n=i; n>=1; n--){
             if(i%n==0){
 		       counter = counter++;
	     }
	  }
	  if (counter ==2){
	     
	     primeNumbers = primeNumbers + i + " ";
	  }	
    }	
       System.out.println("Prime numbers from 1 to 1000 are :");
       System.out.println(primeNumbers);
   }
}