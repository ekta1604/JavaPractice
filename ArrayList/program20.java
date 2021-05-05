package ArrayList;

import java.util.ArrayList;
public class program20 {
  public static void main(String[] args)throws Exception
  {
    try
    {
    ArrayList<Integer> colours = new ArrayList<Integer>(9);
    colours.add(12);
    colours.add(45);
    colours.add(30);
    colours.add(60);
    System.out.println("Arraylist: "+colours);
    System.out.println("Incresing capasity 9 from 500");
    colours.ensureCapacity(500);  
    System.out.print("ArrayList numbers can now store upto 500 elements."); 
    
}
catch(Exception e)
{
    System.out.println("Exception Throws: "+e);
}

  }
}