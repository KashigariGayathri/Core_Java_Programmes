package interfaceExamples;
//in this program all are different methods
interface CollegeData
{
	public void collegeDetail();
	public void studentData();
}
interface HostelData
{
	public void hostelDetail();
	public void studentRecord();
}
class StudentRecord implements CollegeData,HostelData
{
	@Override
	public void collegeDetail()
	{
		System.out.println("College Name : koti womens college");
        System.out.println("College location : koti,Hyderabad");
        System.out.println("College University : Osmania University");
	}
	@Override
	public void studentData() 
	{
		System.out.println("student Name : Gayathri");
        System.out.println("Previous year percentage : 9.01");
        System.out.println("courses of Student : MCA");
	}
	@Override
	public void hostelDetail()
	{
		System.out.println("Hostel Name : koti hostel");
        System.out.println("Hostel location : womens college");
	}
	@Override
	public void studentRecord()
	{
		System.out.println("Student Name : Gayathri");
        System.out.println("Student criteria: based on percentage");
	}
}

public class InterfaceExtendsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRecord obj = new StudentRecord();
	       obj.collegeDetail();
	       obj.studentData();
	       obj.hostelDetail();
	       obj.studentRecord();

	}

}
