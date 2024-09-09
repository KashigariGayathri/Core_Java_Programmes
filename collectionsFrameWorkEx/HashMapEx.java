package collectionsFrameWorkEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<>();
		hm.put("1", "First");
		hm.put("2", "Second");
		hm.put("3", "Third");
		hm.put("4", "Fourth");
		hm.put("5", "Fifth");
		hm.put("6", "sixth");
		hm.put("7", "seventh");
		 // hash_table.remove("6");
        //System.out.println("After del 6 :"+hash_table);
        hm.putIfAbsent("8", "eighth");
        hm.putIfAbsent("9", "day");
        hm.putIfAbsent("6", "Friday");
        //hash_table.put("10", null);
        System.out.println(hm);
        Map<Integer, String> hash_map = new HashMap<>();
        hash_map.put(1, "pooja");
        hash_map.put(2, "priya");
        hash_map.put(3, "prualu");
        System.out.println(hash_map);
//       Map<String,String> hclone=(Map<String, String>) ((HashMap<String, String>) hash_table).clone();
//       System.out.println("***"+hclone);
        
	}

}
