package interfaceExamples;
//in this program same method is present in different interfaces
interface CollegeData1
{
    public void collegeDetail1(); 
    default void studentData1() 
    {
    	System.out.println("student Name : Gayathri");
        System.out.println("Previous year percentage : 9.01");
        System.out.println("courses of Student : MCA,");
    }
}
interface HostelData1
{
    public void hostelDetail1(); 
    default void studentData1()
    {
        System.out.println("Student selected on based : Percentage, Financial condition");
    }
}
 class StudentRecord1 implements CollegeData1, HostelData1
{ 
    @Override
    public void hostelDetail1() 
    {
    	System.out.println("Hostel Name : koti hostel");
        System.out.println("Hostel location : womens college");
    }
    @Override
    public void collegeDetail1() 
    {
    	System.out.println("College Name : koti womens college");
        System.out.println("College location : koti,Hyderabad");
        System.out.println("College University : Osmania University");
    }
    @Override
    public void studentData1() 
    {
        CollegeData1.super.studentData1();
        HostelData1.super.studentData1();
    }
}
public class InterfaceExtendsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRecord1 obj = new StudentRecord1();
	       obj.collegeDetail1();
	       obj.hostelDetail1();
	       obj.studentData1();

	}

}
