class A  
{ 	void show()  
	{ 
		System.out.println("Super class show method called"); 
	} } 
class B extends A  
{ 
	
	void show()  
	{ 
		
		System.out.println("sub class show method called"); 
	} 
} 
class Practical16  
{ 	public static void main(String args[])  
	{ 
		B subOb = new B();  		subOb.show();  } } 

