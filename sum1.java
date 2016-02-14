import java.util.*;
import java.io.*;


public class sum1{

public static int[] suma(int[] a)
{
 int sum=0;
 int[] b= new int[a.length];
	for(int i=0; i<a.length;i++)
	{
      for(int j=i; j< a.length; j++)
      {
        sum= sum+a[j];
      }
      b[i]=sum;
      sum=0;

	}
	return b;

}

public static void main(String args[])
{
	int[] a = new int[6];
	for(int i=0; i<6; i++)
	{

	 a[i]=i+1;
	}

	int[] b= new int[6];
	b= suma(a);

	for(int i=0 ; i<6;i++){
	 System.out.println(b[i]);
	}

}

}