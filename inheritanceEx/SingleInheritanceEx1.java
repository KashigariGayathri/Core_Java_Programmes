package inheritanceEx;


	class Parent1 {
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

	class Child1 extends Parent1 {
		String cname = "gayathri";
		String surname = "kashigari";

		void displayChild() {
			System.out.println("My Parent surname  : " + super.surname);
			System.out.println("My  surname : " + surname);
			System.out.println("My  name is : " + cname);
			// System.out.println("My parent name is : " + name);(this sentence gives error
			// because name is not visible since it is declared private
			System.out.println("My   parent name is : " + getName()); // Accessing name using getter method

		}

		void msg() {
			// super keyword is used when ur parent and child variable/method name are same
			super.msg();// super.methodname-->Called parent class method
			System.out.println("child class");
		}

	}
	public class SingleInheritanceEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		c1.displayChild();
		// c.diplayParent();
		c1.msg();
//		Parent1 p=new Parent1();
//		p.diplayParent();

	}

}
