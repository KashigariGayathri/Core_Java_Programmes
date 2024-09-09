package interfaceExamples;
interface University
{
    default void universityInfo()
    {
        System.out.println("University Name : Osmania University");
        System.out.println("Number of departments : 100");
        System.out.println("Grade of university : A");
    }
}
interface CollegeData2 extends University
{
    public void collegeDetail2(); 
    default void studentData2() 
    {
    	System.out.println("student Name : Gayathri");
        System.out.println("Previous year percentage : 9.01");
        System.out.println("courses of Student : MCA");
    }
}
interface HostelData2 extends University
{
    public void hostelDetail2(); 
    default void studentData2()
    {
        System.out.println("Student selected on based : Percentage, Financial condition");
    }
}
class StudentRecord2 implements CollegeData2, HostelData2 
{ 
    @Override
    public void hostelDetail2() 
    {
        System.out.println("Hostel Name : BC hostel");
        System.out.println("Hostel location : Domalaguda");
    }
    @Override
    public void collegeDetail2() 
    {
        System.out.println("College Name : DCSA");
        System.out.println("College Grade : A");
        System.out.println("University of College : KUK");
    }
    @Override
    public void studentData2() 
    {
        HostelData2.super.studentData2();
        CollegeData2.super.studentData2();
    }
}

public class InterfaceDiamondEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRecord2 obj = new StudentRecord2();
	       obj.universityInfo();
	       obj.collegeDetail2();
	       obj.hostelDetail2();
	       obj.studentData2();

	}

}
