package ArrayList;

import java.util.ArrayList;
public class program17 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);
    
  
        System.out.println("Before Empty");
        System.out.println(colours);
        System.out.println("---------");
        // Collections.removeAll(colours);
        colours.clear();
    
  
        System.out.println("After Remove all elements");
        System.out.println(colours);

  }
}