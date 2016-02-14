import java.io.*;
import java.util.Scanner;

public class SelectionSort
{
 public static void sort(int a[])
 {
   int max, i, j,temp;
  for(i=0;i<a.length;i++)
  {
     max=i;
     for(j=i+1;j<a.length;j++)
    {
  	  if(a[j]>a[max])
  	    max=j;
    }
      temp=a[i];
      a[i]=a[max];
      a[max]=temp;
  } 

}

  public static void main(String args[])
 {
  Scanner input=new Scanner(System.in);
  System.out.println("Enter number of elements");
  int n=input.nextInt();
  int [] array=new int[n];
  System.out.println("Enter elements of the array");
  for(int i=0;i<n;i++)
  {
    array[i]=input.nextInt();
  }
   sort(array);
  for(int i=0; i<n;i++)
   {
    System.out.println(array[i]);
   }
 }

}

/*
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting
 it at the beginning. The algorithm maintains two subarrays in a given array.
1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.
In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the 
sorted subarray

Selection sort is a simple sorting algorithm that improves on the performance of bubble sort. 
It works by first finding the smallest element using a linear scan and swapping it into the first position in the list, 
then finding the second smallest element by scanning the remaining elements, and so on. Selection sort is unique compared to almost
 any other algorithm in that its running time is not affected by the prior ordering of the list: it performs the same number of operations
  because of its simple structure. Selection sort also requires only n swaps, and hence just Θ(n) memory writes, which is optimal for any
   sorting algorithm. Thus it can be very attractive if writes are the most expensive operation, but otherwise selection sort will usually be 
   outperformed by insertion sort or the more complicated algorithms. 
*/
