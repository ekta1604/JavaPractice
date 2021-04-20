
public class TestApp
{
    public static void main(String args[])
    {
        Cat cat=new Cat();
        cat.test1();
        cat.test2();
        cat.test3();
        cat.test4();
        cat.testDefaultMethod();
        Animal.testStaticMethod();

        System.out.println("-----------");

        Animal animal=new Cat();
        animal.test1();
        animal.test2();
        animal.test3();
        animal.test4();
        animal.testDefaultMethod();
        Animal.testStaticMethod();
    }   
}