package Practice;

import java.util.Scanner;

public class ReplaceWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String : ");
String sentence=sc.nextLine();
//String name=sentence.replaceAll("\\s+", "");//slightly faster than \\s
//String name=sentence.replaceAll("\\s", "");
char[] ch=sentence.toCharArray();
String withoutspace="";
//System.out.println(name);
for(int i=0;i<ch.length;i++)
{
if((ch[i]!=' ')&&(ch[i]!='\t'))
	withoutspace=withoutspace+ch[i];
}
System.out.println(withoutspace);
sc.close();
	}

}
