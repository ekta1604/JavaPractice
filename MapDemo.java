import java.util.HashMap;
import java.util.Map;
public class MapDemo {

    public static void main(String args[])
    {
        HashMap<Integer,String> map =new HashMap<Integer,String>();
        map.put(1, "Ekta");
        map.put(2, "Patel");
        // map.put(3, "Heli");
        map.put(4, "Royal");

        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        map.putIfAbsent(3, "Tech");
        System.out.println("-------------");

        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        map.putIfAbsent(5, "soft");
        System.out.println("-------------");


    }
    
}
