// class Test  
// { 
// 	int a, b; 
// 	Test(int i, int j) 
// 	{ 
// 		a = i;  		b = j; 
// 	} 
// 	boolean equals(Test o)  
// 	{ 
// 		if(o.a == a &&o.b == b)  
// 			return true; 
// 		else  
// 			return false; 
// 	} 
// } 
// class Practical4
// {  
// 	public static void main(String args[])  
// 	{ 
// 		Test ob1 = new Test(100, 22); 
// 		Test ob2 = new Test(100, 22); 
// 		Test ob3 = new Test(-1, -1); 
// 		System.out.println("ob1 == ob2: " + ob1.equals(ob2));  		System.out.println("ob1 == ob3: " + ob1.equals(ob3)); 
// 	} 
// } 
// import java.util.Scanner;
 
// public class Test 
// { 
//  void areaCircle() 
//  { 
//  System.out.print("Enter the radius :"); 
//  Scanner s = new Scanner(System.in); 
//  float r = s.nextFloat(); 
//  float area; 
//  area = (r * r) * 22 / 7; 
//  System.out.println("area of the circle is : "+area+" sq units."); 
//  } 
// } 
// class MethodDemo 
// { 
//  public static void main(String args[]) 
//  { 
//  Test obj = new Test(); 
//  obj.areaCircle(); 
//  } 
// } 
// class Main { 
// 	public int addNumbers(int a, int b) { 
// 	int sum = a + b; 
// 	return sum; 
// 	} 
// 	public static void main(String[] args) { 
// 	int num1 = 25; 
// 	int num2 = 15;
// 	Main obj = new Main(); 
// 	int result = obj.addNumbers(num1, num2); 
// 	System.out.println("Sum is: " + result); 
// 	} 
//    } 
//    } 
// 
// import java.util.Scanner; 
// public class Student { 
//  private String name; 
//  private int age; 
//  public Student(){ 
//  } 
//  public Student(String name, int age){ 
//  this.name = name; 
//  this.age = age; 
//  } 
//  public Student copyObject(Student std){ 
//  this.name = std.name; 
//  this.age = std.age; 
//  return std; 
//  } 
//  public void displayData(){ 
//  System.out.println("Name : "+this.name); 
//  System.out.println("Age : "+this.age); 
//  } 
//  public static void main(String[] args) { 
//  Scanner sc =new Scanner(System.in); 
//  System.out.println("Enter your name "); 
//  String name = sc.next(); 
//  System.out.println("Enter your age "); 
//  int age = sc.nextInt(); 
//  Student std = new Student(name, age); 
//  System.out.println("Contents of the original object");

//  std.displayData(); 
//  System.out.println("Contents of the copied object");  Student copyOfStd = new Student().copyObject(std);  copyOfStd.displayData(); 
//  } 
// class ThisKeyword{ 
// 	int rollno; 
// 	String name,course; 
// 	float fee; 
// 	ThisKeyword(int rollno,String name,String course){ 
// 	this.rollno=rollno; 
// 	this.name=name; 
// 	this.course=course; 
// 	} 
// 	ThisKeyword(int rollno,String name,String course,float fee){ this(rollno,name,course);//reusing constructor 
// 	this.fee=fee; 
// 	} 
// 	void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);} } 
// 	class TestThis7{ 
// 	public static void main(String args[]){
// 	 ThisKeyword s1=new ThisKeyword(111,"ankit","java");  ThisKeyword s2=new ThisKeyword(112,"sumit","java",6000f);  s1.display(); 
// 	 s2.display(); 
// 	}} 
	
// class Operation{ 
// 	int data=50; 
// 	void change(int data){ 
// 	 data=data+100;//changes will be in the local variable only } 
// 	public static void main(String args[]){ 
// 	 Operation op=new Operation(); 
// 	 System.out.println("before change "+op.data); 
// 	 op.change(500); 
// 	 System.out.println("after change "+op.data); 
public class JavaTester { 
	public static void main(String[] args) {
   
	IntWrapper a = new IntWrapper(30); 
	IntWrapper b = new IntWrapper(45); 
	System.out.println("Before swapping, a = " + a.a + " and b = " + b.a); 
	swapFunction(a, b); 
	System.out.println("\n**Now, Before and After swapping values will be different here**:"); 
	System.out.println("After swapping, a = " + a.a + " and b is " + b.a); 
	} 
	public static void swapFunction(IntWrapper a, IntWrapper b) {  System.out.println("Before swapping(Inside), a = " + a.a + " b = " + b.a); 
	IntWrapper c = new IntWrapper(a.a); 
	a.a = b.a; 
	b.a = c.a; 
	System.out.println("After swapping(Inside), a = " + a.a + " b = " + b.a); 
	} 
   } 
   class IntWrapper { 
	public int a; 
	public IntWrapper(int a){ this.a = a;} 
   } 
   
	
   
   

