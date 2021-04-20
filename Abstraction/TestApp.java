package Abstraction;
abstract class Animal {
    int no1;
    public Animal()
    {
        no1 = 10;
    }
    public abstract void test1();

    public void test2()
    {
            System.out.println("Animal - first2");
    }

    public static void test3()
    {
        System.out.println("Animal -test3");
    }
}

abstract class Cat extends Animal{
    public abstract void eat();    
}

class Minicat extends Cat{
    @Override
    public void eat()
    {
        System.out.println("MiniCat - eat()");
    }

    @Override
    public void test1()
    {
        System.out.println("MiniCat-test1()");
    }
}
public class TestApp {
    public static void main(String[] args) {
        Minicat m = new Minicat();
        m.eat();
        m.test1();
        m.test2();
        Animal.test3();
    }
}