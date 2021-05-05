package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class program16 {
	public static void main(String[] args)
	{
		
		List<String> original= Arrays.asList("Hii","World","Hello");

		List<String> cloned_list= new ArrayList<String>(original);

		System.out.println(cloned_list);
	}
}
