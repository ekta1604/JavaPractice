package ArrayList;

import java.util.*;
public class program9 {
   public static void main (String[] args) {
      ArrayList<String> colours = new ArrayList<String>();
      colours.add("red");
      colours.add("white");
      colours.add("black");
      ArrayList<String> list = new ArrayList<String>();
      list.add("Hello");
      list.add("Hi");
      list.add("World");
      Collections.copy(list,colours); 
      System.out.println(list);
   }
}