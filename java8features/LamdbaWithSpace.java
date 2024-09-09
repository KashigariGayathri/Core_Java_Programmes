package java8features;
@FunctionalInterface 
interface SpaceBetweenInterface {
    String addSpace(String str);//only 1 abstract method
}
public class LamdbaWithSpace {
//interface-->SpaceBetweenInterface-->method->String addSpace(String)
	//Main->LamdbaWithSpace-->method String insertSpace(string)
	
	
	/*String insertspace(String s) {
        Space sp = (String str) -> {
            String s1 = s.replace("", " ").trim();     // we can also use this method
            return s1;
        };*/
	String insertSpace(String str)
	{
		SpaceBetweenInterface spad=(s1)->{
		     return s1.join(" ", str.split(""));
		 };
		 return spad.addSpace(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamdbaWithSpace lws = new LamdbaWithSpace();
	    String name="Gayathri";
	    System.out.println(lws.insertSpace(name));
	}

}