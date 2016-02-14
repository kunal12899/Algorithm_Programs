import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.Collections;


public class GenricMerge{

public static<T extends Comparable<T>> void mergesort1(T [] a,int start,int last)
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

@SuppressWarnings("unchecked") public static <T extends Comparable<T>> void merge(T [] a, int start,int mid, int last)
 {
  int i,j,k;
   i=start;
   j=mid+1;
   k=0;
Object[] a1 = new Object[last-start+1];

while(i<=mid && j<last)
{

 if (a[i].compareTo(a[j])<=0)
 {
     a1[k]=a[i];
     i++;
 }
 else
 {

  a1[k]=a[j];
   j++;
 }
 k++;
}
  while(i<=mid)
  {

   a1[k]=a[i];
   i++;
   k++;

  }
  while(j<last)
  {

   a1[k]=a[j];
   j++;
   k++;
  }

  for (k = 0; k < a1.length; k++) {
      a[k+start] = (T)(a1[k]); 
  }

}

public static void main(String args[])
{
//Integer arr[] = {12, 11, 13, 5, 6, 7};
  Integer[] a = new Integer[5];
        a[0] = new Integer(2);
        a[1] = new Integer(1);
        a[2] = new Integer(4);
        a[3] = new Integer(3);
        a[4] = new Integer(-1);
System.out.println("after sorting");
int l=a.length;
System.out.println("length  "+l);
mergesort1(a,0,l-1);
for(int i=0;i<l;i++)
    {
    	System.out.println(a[i]);
    }
}
}