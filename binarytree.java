import java.io.*;
import java.util.Scanner;
public class Btree{
	Btree leftnode, rightnode;
	int data;
	public Btree(int d){    
     data=d;
	}
}

public class BtreeImp{
Btree node;
public void addNode(int data)
{
 Btree newnode= new Btree(data);
 if(node==null)
   node=newnode;
else
{
 Btree focusnode=node;
 Btree parent;
  while(true)
   {
   	 parent=focusnode;
       if (focusnode.data< data) 
        {
     	  focusnode= focusnode.leftnode;
     	   if(focusnode==null)
     	   {
     	 	  focusnode=newnode;
     	 	   return;
     	   }   	
        }
       else
       {
     	focusnode=focusnode.rightnode;
     	if(focusnode==null)
     	    {
     		focusnode=newnode;
     		return;
     	    }
       }
      
   }
 
}
}
public static void main(String args[])
{
Btree node;





}





}