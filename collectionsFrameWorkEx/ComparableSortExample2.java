package collectionsFrameWorkEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employeee implements Comparable<Employeee> {

	private String name;
	private int salary;

	public Employeee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employeee [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employeee o) {
		return this.salary.compareTo(o.salary);
	}

}

public class ComparableSortExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employeee> employees = new ArrayList<>(Arrays.asList(
				new Employeee("kapil", 2000),
                new Employeee("zeba", 1500),
                new Employeee("dilip", 1000),
                new Employeee("bipasha", 45000),
                new Employeee("jdhd",23000)
            ));
//		List<Employee> e=new ArrayList<>();
//		e.add(new Employee("Priya",10000));
	
		Collections.sort(employees);//Arrange record in ascending order
        for (Employeee e : employees) {
        	System.out.println(e);
        	//System.out.println(e.getName() + " => " + e.getSalary());
        }

	}

}
