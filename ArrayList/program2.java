package ArrayList;
import java.util.ArrayList;

public class program2 {
  public static void main(String[] args) {
    ArrayList<String> colours = new ArrayList<String>();
    colours.add("Pink");
    colours.add("Brown");
    colours.add("Red");
    colours.add("Green");
    
    for(int i=0;i<colours.size();i++)
    {
        System.out.println(colours.get(i));
    }

  }
}