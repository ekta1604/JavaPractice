import java.util.ArrayList;
import java.util.Collections;
public class program21 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);
    System.out.println("Original"+colours);
    colours.set(1,88);   
    System.out.println("After replacing a element from specific place"+colours);
    
    // for(int i=0;i<colours.size();i++)
    // {
    //     System.out.println(colours);
    // }

  }
}