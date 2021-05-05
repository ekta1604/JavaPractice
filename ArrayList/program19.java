package ArrayList;

import java.util.ArrayList;
public class program19 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>(9);
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);

    colours.trimToSize();   
    
    for(int i=0;i<colours.size();i++)
    {
        System.out.println(colours);
    }

  }
}