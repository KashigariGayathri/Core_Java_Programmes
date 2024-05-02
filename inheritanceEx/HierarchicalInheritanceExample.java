package inheritanceEx;
//Superclass
class Animal {
 void sound() {
     System.out.println("Animals make sounds.");
 }
}

//Subclass 1
class Dog extends Animal {
 void sound() {
     System.out.println("Dogs bark.");
 }
}

//Subclass 2
class Cat extends Animal {
 void sound() {
     System.out.println("Cats meow.");
 }
}

//Subclass 3
class Cow extends Animal {
 void sound() {
     System.out.println("Cows moo.");
 }
}

public class HierarchicalInheritanceExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // Polymorphism: Each object can use its own implementation of the sound method
        dog.sound(); // Calls sound method of Dog class
        cat.sound(); // Calls sound method of Cat class
        cow.sound(); // Calls sound method of Cow class

	}

}
