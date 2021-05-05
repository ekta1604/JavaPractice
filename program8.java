import java.util.ArrayList;
import java.util.Collections;
public class program8 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(4);
    colours.add(30);
    colours.add(6);
    
    System.out.println("Before Sorting");
    System.out.println(colours);
    System.out.println("After Sorting");
    Collections.sort(colours); 
    System.out.println(colours);

  }
}