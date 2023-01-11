import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	
	public static void main(String[] args) {
		
		HashMap<String,String> map =new HashMap<>();
		
		map.put("A", "A1");
		map.put("B", "A1");
		map.put("C", "A1");
		map.put("D", "A1");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
	}
	
}
