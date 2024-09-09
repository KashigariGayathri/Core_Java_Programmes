package java8features;
//Functional Interface is also known as Single Abstract Method Interfaces or SAM
//we can also create our own functional interface and it must start with @FunctionalInterface 
//and it must have only single abstract method,and we can define any number od default and static methods
@FunctionalInterface 
interface validate {
    boolean isValid(String firstName, String lastName);//only 1 abstract method
}
public class LambdawithValidation {
	// TODO Auto-generated method stub
			 boolean validate(String username,String password){
				 validate v=(s1,s2)->{
				     return (s1.equals("ABC")&&s2.equals("DEF"))?true:false;
				 };
				 return v.isValid(username,password);
				}
	
			public static void main(String[] args) {
			    LambdawithValidation s=new LambdawithValidation();
			    String uname="ABC1";
			    String pass="DEF1";
			    System.out.println(s.validate(uname,pass));
	}

}
