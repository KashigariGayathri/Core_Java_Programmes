package collectionsFrameWorkEx;
import java.util.Set;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class HashMapUsingEnhanceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, String> hash_map = new HashMap<>();
	        hash_map.put(1, "pooja");
	        hash_map.put(2, "priya");
	        hash_map.put(3, "prualu");
	        hash_map.put(3, "pallavi");//it overrides the previous value
	        hash_map.put(4, "prualu");//it prints as it is even the value is same
	        System.out.println("Using Normal print Method");
	        System.out.println(hash_map);
	        System.out.println("Using Enhance for loop ");
	        Set<Entry<Integer,String>> eset=hash_map.entrySet();
	        for(Entry<Integer,String> entry : eset)
	        {
	        	System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	        System.out.println(hash_map.containsKey(4));
	        System.out.println(hash_map.containsKey(5));
	        System.out.println(hash_map.containsValue("pooja"));
	        System.out.println(hash_map.containsValue("Gayatrhi"));
	        System.out.println(hash_map.size());  
}

}
