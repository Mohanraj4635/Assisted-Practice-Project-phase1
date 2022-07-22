package maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashtable {

	
	public static void main(String[] args) {
		
		Hashtable<Integer, String>  map= new Hashtable<Integer, String>();
		map.put(1, "Boy");
		map.put(2, "Girl");
		
		map.put(3, "my");
		
		map.put(5, "kalai");
		
		System.out.println(map);
		System.out.println("Get 3: "+map.get(3));
		
		System.out.println("Get 5: "+map.get(5));
		
		System.out.println("Get 8: "+map.get(8));
		
		System.out.println("Get 6: "+map.get(6));
		
		map.remove(5);
		
		System.out.println(map);
		
		for(Map.Entry m: map.entrySet()) {
			
			System.out.println(m.getKey()+" , "+m.getValue());
		}		
		
		
		
		
	}
}