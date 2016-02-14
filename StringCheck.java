import java.io.*;
import java.util.Scanner;

public class StringCheck{

public static boolean checkString(String s)
{
int l= s.length()-1;

for(int i=0; i<l;i++)
{   
	int count=0;
    for(int j=0; j<l;j++)
    {
        if(s.charAt(i)==s.charAt(j))
        	count++;
    }
     if(count==2)
     	return false;     
}
return true;
}


public static boolean isUniqueChars2(String str)
{
  if (str.length() > 256) 
	return false;
  boolean[] char_set = new boolean[256];
  for (int i = 0; i < str. length(); i++) 
    {
     int val = str.charAt(i);
      if (char_set[val]) 
        { // Already found this char in string
          return false;
        }
          char_set[val] = true;
    }
	   return true;
}


public static void main(String args[])
{
Scanner input= new Scanner(System.in);
String s="";
s=input.nextLine();
boolean b;
b=isUniqueChars2(s);
System.out.println(b);
}
}