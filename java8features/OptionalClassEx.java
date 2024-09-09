package java8features;

import java.util.Optional;

class Student11{
	String name;
	int age;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student11(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
}
public class OptionalClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student11 Student11 = getStudentWithName("ahmed");
        System.out.println(Student11.getName());
        Optional<Student11> student = Optional.ofNullable(getStudentWithName("hamza"));
        if (student.isPresent()) {
            System.out.println(student.get().getName());
        } else {
            System.out.println("Student  is not present");
        }
    }
    public  static Student11  getStudentWithName(String name ){
        // lets suppose that our database contain only 2 students ahmed and hamza .
        if (name.equals("hamza") || name.equals("ahmed")) {
            return new Student11(name , 22 , "Morocco");
        } else {
            return null ;
     
}
	}

}
