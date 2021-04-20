public abstract class GrandFather{

	int no=1;
	public GrandFather(){
	int no1=24;
	}
//abstract methods
	public abstract void test1();
//nonabstract methods
	public void test2(){
	System.out.println("GrandFather-test2");
	}
//static methos
	public static void test3(){
	System.out.println("GrandFather-test3");
}
}
public abstract class Father extends GrandFather{
	public abstract void walk();
}
public class Son extends Father{

	public void walk(){
	System.out.println("Son-walk()");
	}
	public void test1();{
	System.out.println("Son-test1()");
}
}
public class SampleAbstraction{

	public static void main(String[] args){
	Son s=new Son();
	s.test1();
	s.test2();
	GrandFather.test3();
}
}