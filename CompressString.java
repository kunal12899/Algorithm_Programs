import java.io.*;
import java.util.Scanner;

public class CompressString{

public String replace1(String s)
{
StringBuffer s1= new StringBuffer();
char last=s.charAt(0);
int count=1;
    for(int i=1;i<s.length();i++)
   {
   	if(s.charAt(i)==last)
    {
      count++;
    }   
    else{
      s1.append(last+ ""+count);
      last=s.charAt(i);
      count=1;
    }
   }      
   s1.append(last+""+count);
return s1.toString();
}

public static void main(String args[])
{
CompressString r= new CompressString();
System.out.println("Enter you desire stirng");
Scanner input= new Scanner(System.in);
String s=input.nextLine();
String result="";
result = r.replace1(s);
int l=result.length();
System.out.println("Result after operation");
if(l<s.length())
System.out.println(result);
else
System.out.println(s);
System.out.println(String.valueOf(32).length());
}





}

/*
public String replace1(String s)
{
int[] count= new int[256]; 
char[] result= s.toCharArray();
StringBuffer s1= new StringBuffer();
int j;
    for(int i=0;i<s.length();i++)
   {
        j=i+1;
        System.out.println("j "+j);
        count[s.charAt(i)]+=1;
        while(s.charAt(i)==s.charAt(j) && j<l-1)
        {         
         count[s.charAt(i)]+=1;
        // if(j<l-1)
         j++;
         //System.out.println("j inside while "+j);
        }             
           s1=s1.append(s.charAt(i)).append(count[s.charAt(i)]);
          // System.out.println("s1 "+s1);
           i=j;
         //  System.out.println("Val of i "+i);
    }      
return s1.toString();
}


*/