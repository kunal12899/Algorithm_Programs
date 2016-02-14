import java.io.*;
import java.util.Scanner;

public class ReverseString{
public boolean isAlpha(char x)
{
return ( (x >= 'A' &&  x <= 'Z') ||
             (x >= 'a' &&  x <= 'z') );

}
public String Reverse(String s)
{
char[] result = s.toCharArray();
int n=s.length();
int l=0, r=n-1;
char temp;
while(l<r)
{
   if(!(isAlpha(s.charAt(l))))
   	  l++;
   	else if (!(isAlpha(s.charAt(r))))
       r--;
    else
    {
    	result[l]=s.charAt(r);
        result[r]=s.charAt(l);
        l++;
        r--;
    }    

}
String output=new String(result);
return output;
}
public static void main(String args[])
{
ReverseString r= new ReverseString();
System.out.println("enter the desire string");
String s= "";
Scanner input= new Scanner(System.in);
s=input.nextLine();
String n="";
n=r.Reverse(s);
System.out.println(n);
}


}