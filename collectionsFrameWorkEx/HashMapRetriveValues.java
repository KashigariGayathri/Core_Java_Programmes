package collectionsFrameWorkEx;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
public class HashMapRetriveValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
         
	        //Adding key-value pairs to HashMap
	         
	        map.put(1, "AAA");
	         
	        map.put(2, "BBB");
	         
	        map.put(3, "CCC");
	         
	        map.put(4, "DDD");
	         
	        map.put(5, "EEE");
	         
	        //Retrieving the Collection view of values present in map
	         
	        Collection<String> values = map.values();
	         
	        for (String value : values) 
	        {
	            System.out.println(value);
	        }
	}

}
