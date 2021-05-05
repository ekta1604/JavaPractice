import java.util.Iterator;
import java.util.PriorityQueue;
public class TestPriorityQueue {

    public static void main(String args[])
    {
        PriorityQueue<String> queue=new PriorityQueue<String>();

        queue.add("ekta");
        queue.add("aniket");
        queue.add("biswa");
        queue.add("diya");
        queue.add("fenali");

        Iterator<String>itr=queue.iterator();
        while(itr.hasNext())
        {
            String name=(String)itr.next();
            System.out.println(name);
        }
    }
    
}

