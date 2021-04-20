class Test  
{ 
	int a, b; 
	Test(int i, int j)  
	{ 
		a = i;  		
        b = j; 
	} 

	void meth(Test o)  
	{ 
		o.a *= 2; 
		o.b /= 2; 
	} 
} 
public class Practical7  
{ 
	public static void main(String args[])  
	{ 
		Test ob = new Test(7,14); 
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b); 
		ob.meth(ob); 
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b); 
    }
}
