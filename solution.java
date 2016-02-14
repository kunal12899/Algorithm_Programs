import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int N, K;
       // System.out.println("Enter the value of N");
        Scanner in = new Scanner(System.in);
        N= in.nextInt();
       // System.out.println("Enter the value of K");
        K= in.nextInt();
       // System.out.println("Enter the number of the array");
            int[] a= new int[N];
        for(int i=0;i<N; i++)
            {
             a[i]=in.nextInt();           
        }
        WindowResult(a,N,K);
    }
    
    public static void WindowResult(int[] a, int n, int k)
        {
            int l=a.length;
            int inc=0;
            int dec=0;
            int result=0;
            int m;
        for(int i=0; i<l-k+1;i++)
            {
            for(int j=0; j<k;j++){
                m=1;
                while(m+j<k){
                    if(a[i+j]>= a[i+j+m]){
                        dec=dec+1;
                        m++;
                       }
                    else if(a[i+j]< a[i+j+m])
                        {
                        inc=inc+1;
                        m++;
                        }          
                }
            }
            result=inc-dec;
            System.out.println(result);
            inc=dec=result=0;            
        }         
    }   
    
}