package ArrayList;

import java.util.ArrayList;
public class program18 {
  public static void main(String[] args) {
    ArrayList<Integer> colours = new ArrayList<Integer>();
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);

        if(colours.isEmpty()==true)
        {
            System.out.println("Empty");
        }
        else{
            System.out.println("not Empty");
        }

  }
}