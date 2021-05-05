import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueue {

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
// import java.util.Iterator;
// import java.util.PriorityQueue;

// public class PriorityQueue {

// 	public static void main(String[] args) 
// 	{
// 		PriorityQueue<String> queue = new PriorityQueue<String>();
		
// 		queue.add("rahul");
// 		queue.add("ankur");
// 		queue.add("brijesh");
// 		queue.add("rakesh");
// 		queue.add("ajay");
// 		queue.add("parth");
		
// 		Iterator<String> itr =  queue.iterator();
		
// 		while (itr.hasNext()) 
// 		{
// 			String name = (String) itr.next();
// 			System.out.println(name);
// 		}
// 	}
// }
