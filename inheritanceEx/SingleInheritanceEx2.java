package inheritanceEx;


    class ParentOne {
        private String name = "srinivas";
        String surname = "kashigari";

        void diplayParent() {
            System.out.println("My father name is : " + name);
        }

        String getName() {
            return name;
        }

        void msg() {
            System.out.println("Parent class");
        }
    }

    class ChildOne extends ParentOne {
        String cname = "gayathri";
        String surname = "kashigari";

        void displayChild() {
            System.out.println("My Parent surname  : " + super.surname);
            System.out.println("My  surname : " + surname);
            System.out.println("My  name is : " + cname);
            System.out.println("My   parent name is : " + getName()); // Accessing name using getter method
        }

        void msg() {
            super.msg(); // Call parent class method
            System.out.println("child class");
        }
    }
    public class SingleInheritanceEx2 {
	
		    public static void main(String[] args) {
		        ChildOne c = new ChildOne();
		        c.displayChild();
		        c.msg();
		    

	}

}
