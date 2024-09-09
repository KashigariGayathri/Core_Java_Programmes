package oopsConceptExamples;
abstract class Employee{
    private int hrs;
    private String nm;
    abstract public int calSal();//abstract method
    public void disEmp() {
        System.out.println("Empl class");
    }
    public Employee(int hrs, String nm) {
        super();
        this.hrs = hrs;
        this.nm = nm;
    }
    
    public int getHrs() {
        return hrs;
    }
    public void setHrs(int hrs) {
        this.hrs = hrs;
    }
    public String getNm() {
        return nm;
    }
    public void setNm(String nm) {
        this.nm = nm;
    }    
}
 class Contractor extends Employee {
    private int workinghrs;
    public Contractor(int hrs, String nm,int workinghrs) {
        super(hrs, nm);
        this.workinghrs=workinghrs;
    }
    @Override
    public int calSal() {
        // TODO Auto-generated method stub
        return getHrs()*workinghrs;
    
    }
}
class FullTimeEmp extends Employee{
    public FullTimeEmp(int hrs, String nm) {
        super(hrs, nm);
        
    }
    @Override
    public int calSal() {
        return getHrs()*8;
    }
    
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		Employee cemp=new Contractor(5, "Raju", 7);
        Employee femp=new FullTimeEmp(5, "priya");
        System.out.println("Contract Emp: "+cemp.calSal());
        System.out.println("Fulltime Emp : "+femp.calSal());
        cemp.disEmp();

	}

}
