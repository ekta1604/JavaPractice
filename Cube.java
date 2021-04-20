 public class Box{
    double h;
    double w;
    double d;

    void volume()
    {
        System.out.println(h*w*d);
    }
}

 class Cube{

   public static void main(String[] args) {

    Box obj1=new Box();

    obj1.h=10;
    obj1.w=20;
    obj1.d=5;

    Box obj2=new Box();

    obj2.h=5;
    obj2.w=5;
    obj2.d=5;

    System.out.println(obj1.volume());
    System.out.println(obj2.volume());

    
}

}