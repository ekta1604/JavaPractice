package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Program7 {
   public static void main(String[] args) {
      ArrayList<Integer> a = new ArrayList<Integer>();
      a.add(1);
      a.add(2);
      a.add(3);
      a.add(4);
      a.add(5);
      int index1 = a.indexOf(2);
      int index2 = a.indexOf(3);
      if(index1 == -1)
         System.out.println("The element 2 is not in the ArrayList");
      else
         System.out.println("The element 2 is in the ArrayList at index " + index1);
      if(index2 == -1)
         System.out.println("The element 3 is not in the ArrayList");
      else
         System.out.println("The element 3 is in the ArrayList at index " + index2);
   }
}