package garbageExamples;

public class GarbageColDemo {
	//this finalize() method will only be called when the objects are defined null
	  public void finalize()
      {
          System.out.println ("Garbage Collection performed by JVM");
      }
	  public void display()
      {
          System.out.println ("Garbage Collection performed by JVM");
      }
	public static void main(String[] args) {
		// finalize() method is compulsory  in garabage collection programs
		  GarbageColDemo s1 = new GarbageColDemo();
          GarbageColDemo s2 = new GarbageColDemo();
          s1 = null;
          s2 = null;
          System.gc();
//          s1.display();
//          s2.display();   //these will not call the diaplay method because we are declaring s1,s2 objects are null, so to run these comment 16,17 lines
	}

}
