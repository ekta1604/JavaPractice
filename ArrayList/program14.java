package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class program14 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);
    
  
        System.out.println("Before Swaping");
        System.out.println(colours);
        System.out.println("---------");
        Collections.swap(colours,1,2);
    
  
        System.out.println("After Swaping");
        System.out.println(colours);

  }
}