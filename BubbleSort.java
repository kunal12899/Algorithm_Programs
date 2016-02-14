import java.util.Scanner;
import java.io.*;

public class BubbleSort
{
public static void sort(int[] a)
{
  int l= a.length;
  int i, j, temp;
 for(i=0; i<l;i++)
   {
    for(j=0;j<l-i-1;j++)   // every step we are lower down the comparasion becasue at the end of one phase last  elemets must be in sorted order.
    {
      if(a[j]>a[j+1])
      {
      	temp=a[j+1];
      	a[j+1]=a[j];
      	a[j]=temp;
      }

    }

   }
}	

public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter the number of elemnts you want");
int n= input.nextInt();
int[] array=new int[n];
for(int i=0;i<n;i++)
{
array[i]=input.nextInt();
}
sort(array);
System.out.println("Elements after sorting");
for(int i=0;i<n;i++)
{
System.out.println(array[i]);
}

}

}

/*
Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
Auxiliary Space: O(1)
Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
Sorting In Place: Yes
Stable: Yes
Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm.
In computer graphics it is popular for its capability to detect a very small error (like swap of just two elements) in almost-sorted arrays and
 fix it with just linear complexity (2n). For example, it is used in a polygon filling algorithm, where bounding lines are sorted by their x coordinate
 at a specific scan line (a line parallel to x axis) and with incrementing y their order changes (two elements are swapped) only at intersections of two 
 lines 

*/