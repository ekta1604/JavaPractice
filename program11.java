import java.util.ArrayList;
import java.util.Collections;
public class program11 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);
    
  
        System.out.println("Before Reversing");
        System.out.println(colours);
        System.out.println("---------");
        Collections.reverse(colours);
    
  
        System.out.println("After Reversing");
        System.out.println(colours);

  }
}