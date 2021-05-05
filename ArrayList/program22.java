package ArrayList;

import java.util.ArrayList;
public class program22 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);
    System.out.println("Original"+colours);
    System.out.println("Using array of an index");

    for(int i=0;i<colours.size();i++)
    {
        System.out.println(colours.get(i));
    }

  }
}