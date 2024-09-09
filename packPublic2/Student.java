package packPublic2;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library li=new Library();
		li.display1();
		Professor pro=new Professor();
		pro.accessMethod(li);

	}

}
