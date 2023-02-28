package MAP;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
	
	public void hashMap() {
		
		HashMap<Integer,String> empmap = new HashMap<Integer,String>();
		empmap.put(1, "ARshad");
		empmap.put(2, "ARshad");
		empmap.put(3, "Dulqar");
		empmap.put(4, "Nazriya");
		empmap.put(4, "Fahad");	
		
		System.out.println("Employee MAp: "+ empmap);
		
		//to copy one map to another map
		
		HashMap<Integer, String> duplicateMap = new HashMap<Integer, String>();
		duplicateMap.putAll(empmap);
		System.out.println("Duplicate Map : "+ duplicateMap);
		
		duplicateMap.clear();
		System.out.println("Duplicate Map : "+ duplicateMap);
		
		System.out.println("Does this map particualr key 1: " + empmap.containsKey(1));
		System.out.println("Does this map particualr value fahad: " + empmap.containsValue("Fahad"));
		
		//to clone map
		System.out.println("Cloned Map: "+ empmap.clone()); // to make a copy
		
		System.out.println("Is it empty "+ duplicateMap.isEmpty());
		
		System.out.println("All keys: "+ empmap.keySet()); //will print all keys
		
		System.out.println("Will return value of index key: "+ empmap.get(1));
		
		System.out.println("All values: "+ empmap.values()); // will print all values
		
		System.out.println("Return All Entry: " + empmap.entrySet());
		
		Iterator<Integer> iterator = empmap.keySet().iterator();
		while(iterator.hasNext()) {
			int key=(int)iterator.next();
			System.out.println("Keys: "+ key + "     Values: " + empmap.get(key));
		}
		
	}

	public static void main(String[] args) {
		
		
		HashMapExample hashmapeg = new HashMapExample();
		hashmapeg.hashMap();
	}
}
