package innerclass;

public class TestOuter1 {

    static int data=30;

    static class inner{

        void msg()
        {
            System.out.println("data: "+data);
        }
    }
    public static void main(String args[])
    {
        TestOuter1.inner in=new TestOuter1.inner();

        in.msg();
    }
    
}
