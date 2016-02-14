import java.util.Scanner;
import java.io.*;

public class MergeSort{

public static void mergesort1(int [] a,int start,int last)
{
	int mid;
 if(start<last)
 	{
   mid=(start+last)/2;
   mergesort1(a,start,mid);
   mergesort1(a,mid+1,last);
   merge(a,start,mid,last);
    }
}

public static void merge(int[] a, int start,int mid, int last)
{
int i,j,k,n1,n2;

n1=mid-start+1;
n2=last-mid;
int[] a1= new int [n1];
int[] b1= new int[n2];

for(i=0;i<n1;i++)
   a1[i]=a[start+i];
for(j=0;j<n2;j++)
	b1[j]=a[mid+1+j];

i=0;
j=0;
k=start;

while(i<n1 && j<n2)
{

 if (a1[i]<=b1[j])
 {
    a[k]=a1[i];
     i++;
     k++;
 }
 else
 {

  a[k]=b1[j];
   j++;
   k++;
 }
}
  while(i<n1)
  {

   a[k]=a1[i];
   i++;
   k++;

  }
  while(j<n2)
  {

   a[k]=b1[j];
   j++;
   k++;
  }

}

public static void main(String args[])
{
int arr[] = {12, 11, 13, 5, 6, 7};
System.out.println("after sorting");
int l=arr.length;
System.out.println("length  "+l);
mergesort1(arr,0,l-1);
for(int i=0;i<l;i++)
    {
    	System.out.println(arr[i]);
    }
}
}