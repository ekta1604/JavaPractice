package innerclass;

public class LocalIneerClass{

    private int data=30;
    
    void display()
    {
        class Local{
            void msg()
            {
                System.out.println("data: "+data);
            }
        }
        Local l = new Local();
        l.msg();
    }
    public static void main(String args[])
    {
        LocalIneerClass local = new LocalIneerClass();
        local.display();
    }
   
    
}
