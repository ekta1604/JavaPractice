import java.util.ArrayList;

public class program4 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);
    
    for(int i=0;i<colours.size();i++)
    {
        System.out.println(colours.get(i));
    }

    int r = colours.get(3);
      System.out.println("Retrieved element is = " + r);

  }
}