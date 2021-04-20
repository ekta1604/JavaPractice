public class modifi
{
    //static BLOCK
    static
    {
        System.out.println("Static Block");
    }
    //Instance Block
    {
        System.out.println("Instance Block-1");
    }
    {
        System.out.println("Instance Block-2");
    }
    //Default Constructor
    public modifi()
    {
        System.out.println("Default constructor");

    }
    //para Constructor
    public modifi(int n1)
    {
         System.out.println("para constructor");
    }
    //static method
    public static void test1()
    {
        System.out.println("Start: test-1 method");
        System.out.println("Exit: test-1 method");
    }
    //nonstatic method
    public void test2()
    {
        System.out.println("Start: test-2 method");
        System.out.println("Exit: test-2 method");
    }
    public static void main(String[] args)
    {
        System.out.println("Start: Main Method");
        modifi.test1();

        modifi obj =new modifi();
        obj.test2();

        System.out.println("Exit: Main Method");
    }


}