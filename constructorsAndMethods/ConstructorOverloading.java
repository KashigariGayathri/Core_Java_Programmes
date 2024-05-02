package constructorsAndMethods;

public class ConstructorOverloading {

		String name;
		int age;
		public ConstructorOverloading() {
			System.out.println("Default Constructor");
		}
		ConstructorOverloading(String name) {
			this.name=name;
			System.out.println("Name : "+name);
		}
		ConstructorOverloading(String name,int age) {
			this.name=name;
			this.age=age;
			System.out.println("Name : "+name+"      "+"Age : "+age);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConstructorOverloading co1=new  ConstructorOverloading();
		 ConstructorOverloading co2=new  ConstructorOverloading("Gayathri");
		 ConstructorOverloading co3=new  ConstructorOverloading("Gayathri",22);


	}

}
