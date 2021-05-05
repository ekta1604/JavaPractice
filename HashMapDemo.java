import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer,String>map=new LinkedHashMap<>();
        map.put(3, "Value3");
        map.put(5, "Value5");
        map.put(2, "Value2");
        map.put(4, "Value4");
        map.put(1, "Value1");

        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("map.keySet() - "+map.keySet());
		System.out.println("map.values() - "+map.values());
		System.out.println("map.entrySet() - "+map.entrySet());
		
		map.remove(1);
		System.out.println("After remove : - ");
		for(Map.Entry<Integer,String>  entry :  map.entrySet()) 
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		

    }
}