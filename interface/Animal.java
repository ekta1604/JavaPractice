

public abstract interface Animal
{
    int no1=10;
    public int no2=20;
    static int no3=30;
    final int no4=40;
    public static final int no5=50;

    void test1();
    public void test2();
    abstract void test3();
    public abstract void test4();

    default void testDefaultMethod()
    {
        System.out.println("Animal-testDefaultMethod()");
    }
    static void testStaticMethod()
    {
        System.out.println("Animal-testStaticMethod()");
    }
    private void testPrivateMethod()
    {
        System.out.println("Animal-testPrivateMethod()");

    }
}