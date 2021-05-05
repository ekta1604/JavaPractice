import java.util.ArrayList;
import java.util.Collections;

public class ArraySorting {
    public static void main(String args[])
    {
        Student s1=new Student(1,"Ekta",12);
        Student s2=new Student(2,"Heli",11);
        Student s3=new Student(3,"Diya",10);
        Student s4=new Student(4,"Disha",9);
        Student s5=new Student(5,"Richa",8);

        ArrayList<Student>list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        for(int i=0;i<list.size();i++)
        {
            Student s=list.get(i);
            System.out.println(s);
        }
        Collections.sort(list);

        System.out.println("After sorting: ");

        for(int i=0;i<list.size();i++)
        {
            Student s=list.get(i);
            System.out.println(s);
        }

    }
}
