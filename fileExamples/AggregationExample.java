package fileExamples;
import java.io.Serializable;
import java.lang.ClassNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Address implements Serializable  {
    private String street;
    private String city;
    private String state;
    private String pinCode;
    public Address(String street, String city, String state, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + pinCode + "]";
	}   
}
class Person implements Serializable {
    private String name;
    private int age;
    private Address address;//Aggegration-->has Relation
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}  
}
public class AggregationExample  {

	public static void main(String[] args)throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		serializePerson();
	       Person deserializedPerson = deserializePerson();
	       System.out.println("Deserialized Person: " + deserializedPerson);
	    }
	    public static void serializePerson() throws IOException {
	    	FileOutputStream fos=new FileOutputStream("D:/CoreJavaProgrames/src/fileExamples/person.txt");
	        ObjectOutputStream oos = new ObjectOutputStream(fos) ;
	        Address address = new Address("Ganga Road", "Shahapur", "Maharashtra", "421601");
	        Person person = new Person("Roshani", 25, address);   
	        oos.writeObject(person);
	            System.out.println("Person object serialized successfully.");
	        }
	        private static Person deserializePerson() throws IOException, ClassNotFoundException {
	        Person p = null;
	        FileInputStream fis=new FileInputStream("D:/CoreJavaProgrames/src/fileExamples/person.txt");
	        ObjectInputStream ois = new ObjectInputStream(fis);
	            p = (Person) ois.readObject();
	            System.out.println("Person object deserialized successfully.");     
	        return p;
	    }
	
	}