class DynStack
{ 
	private int stck[];  	
     private int tos; 

	DynStack(int size)  
	{ 
		stck = new int[size]; 
		tos = -1; 
	} 

	public void push(int item)  
	{ 

	if(tos==stck.length-1)  
	{ 
		int temp[] = new int[stck.length * 2];  

        for(int i=0; i<stck.length; i++)  
			temp[i] = stck[i]; 

		    stck = temp;  		
            stck[++tos] = item; 
	} 
	else 
		stck[++tos] = item; 
	} 

	public int pop()  
	{ 
	  if(tos< 0)  
	  { 
	     	System.out.println("Stack underflow."); 
		    return 0; 
	  } 
	  else 
		    return stck[tos--]; 
	} 
} 

class Practical22 
{ 
	public static void main(String args[])  
	{ 
		DynStack mystack1 = new DynStack(5); 
		

		for(int i=0; i<12; i++)  
			mystack1.push(i);  		
		
		System.out.println("Stack in mystack1:");  		
        for(int i=0; i<12; i++) 
			System.out.println(mystack1.pop());  	
        } 
}
