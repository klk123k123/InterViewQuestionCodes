package Practice;

import java.util.Scanner;

public class Pyramid1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pyramid Size : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			//System.out.println(" ");
			{
				for(int j=i;j>=1;j--)
				{
					System.out.print(j+" ");
				}
				System.out.println(" ");
			}
		}
	}

}
