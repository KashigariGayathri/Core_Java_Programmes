package arrayEx;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Array :");
        String str[]= {"Pretha","Roshni","Nandhini"};
        for(int i=0;i<str.length;i++) {
            System.out.print(str[i]+" ");
        }
        for(String str1:str) {
            System.out.println(str1);
        }
	}

}
