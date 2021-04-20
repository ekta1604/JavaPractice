public class TestAppInstance
{
    final int no2=10;
    public static void main(String args[])
    {
        int no1;
        no1=10;

        TestAppInstance obj=new TestAppInstance();
        System.out.println("NO2:"+obj.no2);
        obj.no2=20;
        System.out.println("Updated No2:"+obj.no2);

    }
}
