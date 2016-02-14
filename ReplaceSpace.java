import java.io.*;
import java.util.Scanner;
public class ReplaceSpace{
public String replace(String s)
{
int l=s.length();
char[] change= s.toCharArray();
char temp='2';
for(int i=0;i<l;i++)
{
   if(s.charAt(i)==' ')
   {
      change[i]= temp;
   }
}
return new String(change);
} 

public String replace1(String s)
{
int l=s.length();
char[] change= s.toCharArray();
int count=0;
for(int i=0;i<l;i++)
{
	if(change[i]== ' ')
      count++;
}
int newlength= l+count*2;
char[] change1= new char[newlength];
for(int i=l-1;i>=0;i--)
{
     if(change[i]==' ')
     {
        change1[newlength-1]='0';
        change1[newlength-2]='2';
        change1[newlength-3]='%';
        newlength=newlength-3;
     }
     else
     {
        change1[newlength-1]=change[i];
        newlength=newlength-1;
     }

}

return new String(change1);
} 
public static void main(String args[])
{
ReplaceSpace r= new ReplaceSpace();
System.out.println("Enter you desire stirng");
Scanner input= new Scanner(System.in);
String s=input.nextLine();
String result="";
result = r.replace1(s);
System.out.println("Result after operation");
System.out.println(result);
}
}