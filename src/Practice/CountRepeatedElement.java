package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class CountRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String name=sc.nextLine();
		
//char[] ch=name.toCharArray();
//Arrays.sort(ch);
for(int i=0;i<name.length();i++)
{
	int count=0;
	for(int j=i+1;j<name.length();j++)
	{
	if(name.charAt(i)==name.charAt(j))
	{
		System.out.println(name.charAt(j)+" : "+i);   
		count++;
	}
	
	//if(count>0)
	//System.out.println(name.charAt(i)+" : "+count);
	
}
	}

	}
}

