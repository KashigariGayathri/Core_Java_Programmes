package packPublic1;

public class Education {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University un=new University();
		un.book();
		College col=new College();
		col.book1();
		Faculty fac=new Faculty();
		fac.book2(col);
	}

}
