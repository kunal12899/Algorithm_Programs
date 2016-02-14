import java.util.Scanner;
import java.io.*;
public class InsertionSort{
    public static void sort(int[] a)
    {
    int l=a.length;
    System.out.println(l);
    int i,key,j,temp;
     for(i=1;i<l;i++){
      key=a[i];
      j=i-1;
      while(j>=0 && key<a[j])
      {
      	a[j+1]=a[j];
      	j--;
      }
       a[j+1]=key;
    }

    }

      public static void main(String args[])
    {

    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n= input.nextInt();
    System.out.println("Enter the elemnts of the array");
    int[] array= new int[n];
     for(int i=0;i<n;i++)
        array[i]=input.nextInt();
    sort(array);
    System.out.println("elements after Insertion sorting");
    for(int j=0; j<n ;j++ )
    	System.out.println(array[j]);
    }

}