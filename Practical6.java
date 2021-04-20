class CallByValue
{ 
	void meth(int i, int j)  
	{ 
		i *= 2;  		j /= 2; 
        System.out.println("i= "+i);
        System.out.println("j= "+j);
	} 
} 

public class Practical6  
{ 
	public static void main(String args[])  
	{ 
		CallByValue ob = new CallByValue();  		
        int a = 7, b = 14; 
		System.out.println("a and b before call: " + a + " " + b); 
		ob.meth(a, b); 
		System.out.println("a and b after call: " + a + " " + b); 
        
	} 
}
