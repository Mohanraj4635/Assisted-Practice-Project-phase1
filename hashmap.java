package maps;

import java.util.HashMap;
import java.util.Map;
public class hashmap {
	

	public class HashMapDemo {
		
		public static void main(String[] args) {
			
			HashMap<Integer,String> map=new HashMap<Integer, String>();
			
			map.put(1, "KALAI");

			map.put(2, "MY");
			
			map.put(3, "MOHAN");
			
			map.put(4, null); 
			map.put(null, "KALAI");
			map.put(5, "MOHAN");
			
			System.out.println(map);
			System.out.println("Get 3: "+map.get(3));
			
			System.out.println("Get 5: "+map.get(5));
			
			System.out.println("Get 4: "+map.get(4));
			
			System.out.println("Get null: "+map.get(null));
			
			System.out.println("Get 6: "+map.get(6));
			
			map.remove(5);
			
			System.out.println(map);
			
			for (Map.Entry m:map.entrySet()) {
				
				System.out.println(m.getKey()+ " , "+m.getValue());
			}
			
			
		}

	}

}
