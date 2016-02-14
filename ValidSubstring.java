import java.util.*;

public class ValidSubstring{

static char[] s= new char[10];	
static int m=0;

public static String check(String s)
{
int l=s.length();
char[] a= new char[l];
int j=0;
    for(int i=0;i<l;i++)
    {
       if(s.charAt(i)=='(')
       	push(s.charAt(i));
       	else
       	{
       	 a[j]=pop();
       	  j++;	
       	}
    } 
return String.valueOf(a);

}

public static void push(char k)
{
   s[m++]=k;
}

public static char pop()
{
   return s[m--];
}
   
     public static void main(String args[])
   {
   Scanner input= new Scanner(System.in);
   String first=input.nextLine();
   String result="";
   result=check(first);
   System.out.println("Valid subsequence would be");
   System.out.println(result);
   }
}