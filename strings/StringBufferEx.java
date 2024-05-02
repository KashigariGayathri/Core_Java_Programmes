package strings;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
        System.out.println("My String Before append  : "+sb);
        sb.append("Everyone");
        System.out.println("My String after append  : "+sb);
        System.out.println("Reverse String : "+sb.reverse());
        sb.insert(4, "learner");
        System.out.println("My String after insert  : "+sb);
        sb.delete(4, 10);
        System.out.println("My String after delete  : "+sb);


	}

}
