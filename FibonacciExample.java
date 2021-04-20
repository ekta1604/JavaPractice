public class FibonacciExample{
    int a=0;
    int b=1;
    int c;

    void printfib(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            printfib(i-1);
        }
    }

  public static void main(String[] args)
    {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        FibonacciExample ob=new FibonacciExample();
        ob.printfib(10);
    }
}