class RetOb
{ 	int a; 
	RetOb(int i)  
	{ 
		a = i; 
	} 
	RetOb incrByTen()  
	{ 
		RetOb temp = new RetOb(a+10); 
		return temp; 
	} } 
public class Practical8  
{ 
	public static void main(String args[])  
	{ 
		RetOb ob1 = new RetOb(2);
        //RetOb ob1 = new RetOb(3);  
		RetOb ob2; 
        RetOb ob3 =new RetOb(3);
        ob3 = ob3.incrByTen();
		ob2 = ob1.incrByTen(); 
		System.out.println("ob1.a: " + ob1.a); 

		System.out.println("ob2.a after first increase: " + ob2.a); 

		ob2 = ob2.incrByTen(); 

		System.out.println("ob2.a after second increase: " + ob2.a);  
        System.out.println("ob3.a after first increase: " + ob3.a);	
    }
 }
