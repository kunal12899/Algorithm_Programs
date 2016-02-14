import java.io.*;
import java.util.Scanner;

public class BinarySearch
{

public static int search(int a[], int start, int last, int d)
{
if(last>1)
{
int mid=(start+last)/2;
if(a[mid]>d)
{
	return search(a,start,mid-1,d);
}
else if(a[mid]<d)
{

	return search(a,mid+1,last,d);
}
else
return mid;
}
return -1;
}

public static void main(String args[])
{
Scanner input= new Scanner(System.in);
System.out.println("insert number of elements of the array");
int n=input.nextInt();
System.out.println("enter elements of the array");
int[] a= new int[n];
for(int i=0;i<n;i++)
{
a[i]=input.nextInt();
}
System.out.println("enter your desire number to be search");
int d=input.nextInt();
int position=search(a,0,n-1,d);
System.out.println("Your number is located at position   " +position);
}
}
