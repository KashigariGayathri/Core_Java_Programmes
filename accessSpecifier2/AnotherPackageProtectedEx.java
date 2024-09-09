package accessSpecifier2;
import accessSpecifiers.Forest;
class Forest2 extends Forest
{
	protected void display1()
	{
		woods();
		System.out.println("The woods2 method protected string is :"+str3);
	}
}

public class AnotherPackageProtectedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
