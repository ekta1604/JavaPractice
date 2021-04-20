package innerclass;

public class TestAnonymousInner {

    public static void main(String args[])
    {
        Person p =new Person(){
            public void eat()
            {
                System.out.println("Tes-eat()");
                System.out.println("get.name() : " + getClass().getName());
            }
        };
        p.eat();
    }
    
}
