import java.util.ArrayList;

public class program15 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);
    
    System.out.println("First Arraylist"+colours);

    ArrayList<Integer> colour = new ArrayList<Integer>();
    colour.add(13);
    colour.add(45);
    colour.add(31);
    colour.add(60);
    
    System.out.println("Second Arraylist"+colour);
    
    colour.addAll(colours); 
    System.out.println("joined list: ");  
    System.out.println(colour);

  }
}