class Box1{
    double h;
    double w;
    double d;

    double volume()
    {
        return h*w*d;
    }
}
class Box2
{
    double l,w;
    double area()
    {
        return l*w;
    }
}

public class Vol{

   public static void main(String[] args) {

    Box1 obj1=new Box1();

    obj1.h=10;
    obj1.w=20;
    obj1.d=5;

    Box1 obj2=new Box1();

    obj2.h=5;
    obj2.w=7;
    obj2.d=8;

    Box2 obj3=new Box2();

    obj3.l=5;
    obj3.w=7;

    System.out.println("for obj1");
    System.out.println(obj1.volume());
    System.out.println("for obj2");
    System.out.println(obj2.volume());
    System.out.println("for obj3");
    System.out.println(obj3.area());
    
}

}