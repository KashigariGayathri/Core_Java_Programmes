package java8features;
@FunctionalInterface
interface SpaceBetweenInterface2 {
    String addSpace(String s);
}
public class SpaceBetweenInterfaceExample2 {
	 String insertSpace(String s) {
		    SpaceBetweenInterface2 spaceBetweenInterface = (String s1) -> {
		        StringBuilder stringBuilder = new StringBuilder();
		        for (int i = 0; i < s.length(); i++) {
		            stringBuilder.append(s.charAt(i));
		            if (i != s.length() - 1) {
		                stringBuilder.append(" ");
		            }
		        }
		        return stringBuilder.toString();
		    };
		        return spaceBetweenInterface.addSpace(s);
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpaceBetweenInterfaceExample2 example = new SpaceBetweenInterfaceExample2();
        String s = "Happy";
        System.out.println(example.insertSpace(s));
	}

}
