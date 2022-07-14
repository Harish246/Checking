package ambika;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("Enter the size of an Array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[0];
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
		}
		System.out.println("The maximum number in array is:"+max);
	}

}
