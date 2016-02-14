import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.Collections;

public class MergeLinkedList{
	static Node a, b;

static class Node{

	int x;
	Node next;

	public Node(int data)
	{
		x=data;
		next=null;
	}
}

public static Node merge(Node a, Node b)
{  

 if(a==null && b==null)
 	return null;

  Node res=null;

  while(a!=null && b!=null)
  {
     if(a.x<=b.x)
     {
     	Node temp=a.next;
     	a.next=res;
     	res=a;
     	a=temp;
     }
     else
     {
     	Node temp=b.next;
     	b.next=res;
     	res=b;
     	b=temp;      
     }

  } 
   while(a!= null)
   {
   	Node temp=a.next;
     	a.next=res;
     	res=a;
     	a=temp;
   	
   }

   while(b!= null)
   {
      Node temp=b.next;
     	b.next=res;
     	res=b;
     	b=temp;
   	
   }

   return res;

}

public static void main(String args[])
{
MergeLinkedList list= new MergeLinkedList();
Node result=null;
list.a=new Node(5);
list.a.next=new Node(10);
list.a.next.next= new Node(15);

list.b=new Node(20);
list.b.next=new Node(25);
list.b.next.next= new Node(35);

 result=merge(a,b);

 System.out.println("Merge list");

  while(result!=null)
{
	System.out.println(result.x);
	result=result.next;
}

}


}