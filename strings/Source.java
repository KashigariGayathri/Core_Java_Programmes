package strings;
import java.util.Scanner;
class Sort{
	public char maxOccuringChar(String str)
	{
		char maxChar=' ';
		int max=0;
		int charCount[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			charCount[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++)
		{char ch=str.charAt(i);
			if(max<charCount[ch])
			{   max=charCount[ch];
			    maxChar = ch;
			}
		}
		return maxChar;
		}
	}
public class Source {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Sort so=new Sort();
		char c=so.maxOccuringChar(str);
		System.out.println(c);
		sc.close();
		}
}
