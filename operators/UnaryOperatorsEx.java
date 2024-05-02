package operators;

public class UnaryOperatorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
        int b=19;
        int x=a++;//Post increment-->x=a-->a=a+1
        System.out.println("Post incerement : "+x);
        int y=++b;//pre increment-->a=a+1-->x
        System.out.println("Pre incerement : "+y);
	}

}
