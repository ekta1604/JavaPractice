package ArrayList;
import java.util.ArrayList;

public class program6 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);
    
  
        System.out.println("Before Remove");
        System.out.println(colours);
        System.out.println("---------");
        colours.remove(3);
    
  
        System.out.println("After Remove");
        System.out.println(colours);

  }
}