class AA
{
    void show()
    {
        System.out.println("Hi");
    }

}
class BB extends AA
{
    void show()
    {
        System.out.println("Hello");
    }

}
public class MethodOverriding {

    public static void main(String args[]){
    BB b=new BB();
    b.show();
    AA a=new AA();
    a.show();
    }
}
