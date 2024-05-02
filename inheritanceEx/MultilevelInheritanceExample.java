package inheritanceEx;

class GrandParent {
    void grandParentMethod() {
        System.out.println("This is a method in the GrandParent class.");
    }
}

class Parent extends GrandParent {
    void parentMethod() {
        System.out.println("This is a method in the Parent class.");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("This is a method in the Child class.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Child child = new Child();

        // Calling methods from different levels of inheritance
        child.grandParentMethod(); // Method from GrandParent class
        child.parentMethod();      // Method from Parent class
        child.childMethod();       // Method from Child class
    }
}


