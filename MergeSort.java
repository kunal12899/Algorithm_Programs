import java.lang.*;
import java.util.Comparator;
import java.util.Random;
import java.util.Arrays;

public class MergeSort {
    
   private static long startTime, endTime, elapsedTime;
   private static int phase = 0;
    public static <T extends Comparable<T>> void sort(T[] a) 
    {
	     mergesort(a, 0, a.length-1);
    }
    
    private static <T extends Comparable<T>> void mergesort (T[] a, int i, int j) 
    {
	if (j-i < 1) return;
	int mid = (i+j)/2;
	mergesort(a, i, mid);
	mergesort(a, mid+1, j);
	merge(a, i, mid, j);
    }

    @SuppressWarnings("unchecked") private static <T extends Comparable<T>> void  merge(T[] a, int start, int mid, int last) {

	Object[] a1 = new Object[last-start+1]; 
	int i = start;
	int j = mid+1;
	int k = 0;
	while (i <= mid && j <= last) {
	    if (a[i].compareTo(a[j])<=0)
		a1[k] = a[i++];
	    else
		a1[k] = a[j++];
	    k++;
	}

	while(i<=mid)
  {

   a1[k]=a[i];
   i++;
   k++;

  }
  while(j<=last)
  {

   a1[k]=a[j];
   j++;
   k++;
  }

	for (k = 0; k < a1.length; k++) {
	    a[k+start] = (T)(a1[k]); 
	}
    }
    
     public static void timer()
    {
        if(phase == 0) {
	    startTime = System.currentTimeMillis();
	    phase = 1;
	}    else {
	      endTime = System.currentTimeMillis();
            elapsedTime = endTime-startTime;
            System.out.println("Time: " + elapsedTime + " msec.");
            phase = 0;
        }
    }

 
    public static void main(String[] args) {
    	int size=1000002;
        Integer[] a = new Integer[size];
        Random rand = new Random();
	   for(int i=0; i<size; i++) {
	      a[i] = rand.nextInt(10*size);
	}
       
               timer(); 
           MergeSort.sort(a);           
          for (int i = 0; i < size; i++)
            System.out.println(a[i].toString());
           timer();
    }
}
    