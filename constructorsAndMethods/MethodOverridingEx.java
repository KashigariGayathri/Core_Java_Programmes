package constructorsAndMethods;
//if we declare any class as final-->we can't extend it
class Vehicle{
  //if we declare method as final-->can't override it
  //final class-->can't extend it
   //final variable-->can't change value
  //final void type() {
  //final int s=30;
void type( int speed) {
    //s=45;
    
      System.out.println("Vehicle class type : "+speed);
  }
 
}
class Car extends Vehicle{
  void type(int speed) {
      super.type(80);//suppose if this line is not there then only the child class method only will be called
      System.out.println("car class type : "+speed);
  }
}
public class MethodOverridingEx {
	//method overriding->method name and parameter are same but implment using 
    //inheritance
    //can not override final and static method
	public static void main(String[] args) {
		  Car c=new Car();
	        c.type(100);
	        //c.type(70);

	}

}
