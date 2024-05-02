package constructorsAndMethods;

public class ConstructorType {
	
		 String name;
		    int age;
		    public ConstructorType() {
		        System.out.println("Default Constructor");
		    }
		    ConstructorType(String nm){
		        name=nm;
		        System.out.println("Parametrized Constructor : " +name);
		    }
		    ConstructorType(String nm,int age){
		        name=nm;
		        this.age=age;
		        System.out.println("Parametrized Constructor : " +name+"  "+this.age);
		    }
		    ConstructorType(ConstructorType cobj){
		        name=cobj.name;
		        age=cobj.age;
		        System.out.println("Copy Constructor : " +name+"  " +this.age);
		        
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ConstructorType c1=new ConstructorType();
		 ConstructorType c2=new ConstructorType("Gayathri");
	     ConstructorType c3=new ConstructorType("Gayathri",22);
	     ConstructorType c4=new ConstructorType(c3);


	}

}
