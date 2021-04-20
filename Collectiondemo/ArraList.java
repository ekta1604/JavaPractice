package Collectiondemo;
import java.util.*;
public class ArraList {
    public static void main(String[] args) {
        Student s = new Student(1,"Nisarg", 12);
        ArrayList<String> list = new ArrayList<String>();
        list.add("10");
        list.add("10.543");
        list.add("true");
        list.add("eeee");
        list.add("n");
        list.add("s");
        System.out.println("List size is of "+list.size());
        System.out.println(list.get(3));

        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            if(o instanceof Student)
            {
                s=(Student)o;
                System.out.println(s.getRno()+" "+s.getName()+" "+s.getstd());
            }
            else{
                System.out.println(o);
            }
        }
    }
}