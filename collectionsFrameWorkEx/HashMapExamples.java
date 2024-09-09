package collectionsFrameWorkEx;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapExamples {

	public static void main(String[] args) {
		//  remove a key-value pair from a HashMap if and only if the specified key is currently 
		//mapped to given value
		 HashMap<String, String> map = new HashMap<String, String>();
         
	        //Adding key-value pairs to HashMap
	         
	        map.put("ONE", "AAA");
	         
	        map.put("TWO", "BBB");
	         
	        map.put("THREE", "CCC");
	         
	        map.put("FOUR", "DDD");
	         
	        map.put("FIVE", "EEE");
	         
	        //Printing Key-value pairs
	         
	        System.out.println("HashMap Before Remove :");
	         
	        Set<Entry<String, String>> keyValueSet = map.entrySet();
	         
	        for (Entry<String, String> entry : keyValueSet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	         
	        System.out.println("------------------");
	         
	        //Removes the mapping for the key 'ONE' only if it is currently mapped to 'CCC'
	         
	        map.remove("ONE", "CCC");
	         
	        //Removes the mapping for the key 'FIVE' only if it is currently mapped to 'EEE'
	         
	        map.remove("FIVE", "EEE");
	         
	        System.out.println("HashMap After Remove :");
	         
	        for (Entry<String, String> entry : keyValueSet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	        // replace a value associated with a given key in the HashMap
	        map.replace("THREE", "333");
	         
	        System.out.println("HashMap After Replace :");
	                 
	        for (Entry<String, String> entry : keyValueSet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	        //replace a value associated with the given key if and only if it is 
	        //currently mapped to given value
	        map.replace("FOUR", "DDD", "444");
	         
	        System.out.println("HashMap After Replace :");
	                 
	        for (Entry<String, String> entry : keyValueSet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	        //get synchronized HashMap in java
	      //Getting synchronized Map
	         
	        Map<String, String> syncMap = Collections.synchronizedMap(map);
	        System.out.println(syncMap);
	}

}
