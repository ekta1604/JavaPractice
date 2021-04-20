class Practical18 
{ 
	int a=10; 
	final int b=20; 

	void display() 
	{ 
		System.out.println("A is:" +a +"\n"+"B is (Final):" +b); 
	} 

	public static void main(String args[]) 
	{ 
		Practical18 sd=new Practical18(); 
	
		sd.a=30; 
		
	
		sd.display(); 
	}    }
