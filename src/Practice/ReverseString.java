package Practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String : ");
String name=sc.nextLine();
char ch;
String rev="";
for(int i=(name.length()-1);i>=0;i--)
{
	ch=name.charAt(i);
	rev=rev+ch;
}
System.out.println("Reverse String : "+rev);
	}

}

