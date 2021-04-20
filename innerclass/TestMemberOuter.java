package innerclass;

public class TestMemberOuter {

    private int data=30;

    class inner{

        void msg()
        {
            System.out.println("data: "+data);
        }
    }
    public static void main(String args[])
    {
        TestMemberOuter outer = new TestMemberOuter();
        TestMemberOuter.inner in =outer.new inner();
        in.msg();
    }
    
}
