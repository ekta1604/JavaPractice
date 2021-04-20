import java.util.Scanner;
class First 
{ 
	int a;  	
    int b; 

	void get() 
	{ 
		// a = x;  		
        // b = y; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();

        System.out.println("Value of A is : " + a);  		
        System.out.println("Value of B is : " + b); 

	} 

	// void put() 
	// { 
	// 	System.out.println("Value of A is : " + a);  		
    //     System.out.println("Value of B is : " + b); 
	// } 
} 

class Second extends First 
{ 
 int ans;  
    void cal() 
	{ 
		ans = a + b; 
		System.out.println("Value of ANS is : " + ans); 
	} 
} 
class Practical15 
{ 
	public static void main(String args[]) 
	{ 
		Second s = new Second(); 
		s.get(); 
		// s.put(); 
		s.cal(); 
	} 
} 
