package strings;

import java.util.Arrays;

public class StringMethodsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="jhony jhony yes papa";
		String str2=new String("JHONY JHONY YES PAPA");
		String str3="HoW i WONder ";
		String str4="yes Papa";
		String str5="   papa   ";
		System.out.println("Length of str4 : "+str4.length());//returns integer value
		System.out.println("Length of str1 : "+str1.length());//returns integer value
		System.out.println("Upper Case of str1 :"+str1.toUpperCase());//returns string value
		System.out.println("Upper Case of str2 :"+str2.toLowerCase());//returns string value
		System.out.println("Is both strings are equal :"+str1.equals(str2));//returns boolean value
		System.out.println("Is both strings are equal :"+str1.equalsIgnoreCase(str2));//returns boolean value
		System.out.println("concat string:"+str1.concat(str3));//returns string value
		System.out.println("Index of first occurance of jhony : "+str1.indexOf("jhony"));//returns integer value
		System.out.println("Index of last occurence of jhony : "+str1.lastIndexOf("jhony"));//returns integer value
		System.out.println("Replace string : "+str1.replace("papa","mama"));//returns string
		System.out.println("contains of : "+str1.contains("z"));//returns boolean value
		System.out.println("SubString : "+str1.substring(2,9));//returns string value
		System.out.println("Length of str5 : "+str5.length());//returns integer value
		System.out.println("trim str5 : "+str5.trim());//returns string value
		System.out.println("Length of str5 after trim operation is : "+str5.length());//returns integer value
		String str6 = "How , are , you?";
        String arrStr[] = str6.split(",", 3);//gives spilleted result in seperate lines
        System.out.println("Splited Elements:");
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]+ " ");
        }
		
		System.out.println();
		System.out.println("repeat: "+str5.repeat(5));
		String s1 = "JAVA Program";
        char str7[] = new char[10];
        s1.getChars(0, 8, str7, 0);
        System.out.println("****getChars method: " + Arrays.toString(str7));
        System.out.println(s1.toCharArray());
        
        String str8 = "";
        System.out.println("Length:" + str8.length());
        System.out.println("is String is empty: " + str8.isEmpty());//returns boolean value true
        System.out.println("is String is blank: " + str8.isBlank());//returns boolean value true
    		
        String str9 = " ";//here space is provide
        System.out.println("Length:" + str9.length());
        System.out.println("is String is empty: " + str9.isEmpty());//returns boolean value false
        System.out.println("is String is blank: " + str9.isBlank());//returns boolean value true
	}

}
