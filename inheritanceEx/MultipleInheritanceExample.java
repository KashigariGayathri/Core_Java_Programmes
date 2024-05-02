package inheritanceEx;


	
	// Interface 1
	interface Walkable {
	    void walk();
	}

	// Interface 2
	interface Swimmable {
	    void swim();
	}

	// Class implementing both interfaces
	class Animal implements Walkable, Swimmable {
	    public void walk() {
	        System.out.println("Animal walks");
	    }

	    public void swim() {
	        System.out.println("Animal swims");
	    }
	}
	public class MultipleInheritanceExample {
	public static void main(String[] args) {
		Animal animal = new Animal();
        animal.walk();  // Output: Animal walks
        animal.swim();  // Output: Animal swims

	}

}
