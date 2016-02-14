import java.io.*;
import java.util.Scanner;

public class CheckPermu{

public static boolean isUniqueChars2(String str1,String str2)
{
  if (str1.length()!= str2.length()) 
	return false;
 else
 {
    int[] char_set1 = new int[256];
    int[] char_set2= new int[256];
    for (int i = 0; i < str1. length(); i++) 
    {
     int val = str1.charAt(i);
     char_set1[val] = char_set1[val]+1;
    }
    for (int i = 0; i < str2. length(); i++) 
    {
     int val = str2.charAt(i);
     char_set2[val] = char_set2[val]+1;
    }
    for(int i=0; i<256; i++)
    {
        if(char_set1[i]!=char_set2[i])
        	return false;
    }

}
	      return true;
}


//2nd method

public static String sort(String s)
{
char[] first = s.toCharArray();
java.util.Arrays.sort(first);
return new String(first);

}

public static boolean isunique(String s1, String s2)
{
  if(s1.length()!= s2.length())
  	return false;
  return sort(s1).equals(sort(s2));

}

public static void main(String args[])
{
Scanner input= new Scanner(System.in);
String s="";
String s2="";
System.out.println("enter first string");
s=input.nextLine();
System.out.println("enter 2nd string");
s2=input.nextLine();
boolean b;
//b=isUniqueChars2(s,s2);
b=isunique(s,s2);
System.out.println(b);
}

}