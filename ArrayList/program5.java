package ArrayList;
import java.util.ArrayList;

public class program5 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);
    
  
        System.out.println("Before Upadate");
        System.out.println(colours);
        System.out.println("---------");
        colours.set(0,11);
    
  
        System.out.println("After Upadate");
        System.out.println(colours);

  }
}