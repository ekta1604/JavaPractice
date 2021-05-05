import java.util.Map;
import java.util.TreeMap;

public class TreeMapdemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(3, "value3");
		map.put(5, "value5");
		map.put(2, "value2");
		map.put(4, "value4");
		map.put(1, "value1");
		
		for(Map.Entry<Integer, String> e : map.entrySet()) 
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}