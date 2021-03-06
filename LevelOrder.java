import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class LevelOrder{
	
	static void levelOrder(Node root){
      //Write your code here
        int height=getHeight(root);
        for(int i=1; i<=height;i++){
            printlevel(root,i);            
        }
       
    }

  public static int getHeight(Node root){
    if(root==null)
        return 0;
    else
        return Math.max(getHeight(root.left),getHeight(root.right))+1;    
}

public static void printlevel(Node n, int level){
    if(n==null)
     return;
    if(level==1)
        System.out.print(n.data +" ");
    else if(level>1){
        printlevel(n.left, level-1);
        printlevel(n.right,level-1);
    }    
}

public static  void levelOrder1(Node root){
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
         while(!q.isEmpty()){
            Node n= q.poll();
             System.out.print(n.data +" ");
            if(n.left!=null)
              q.add(n.left);
            if(n.right!=null)
              q.add(n.right);        
         }

}
public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
            levelOrder1(root);
        }	

   // 2nd method of o(n)
     /*   public void static levelOrder(Node n)
        {
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
         while(!q.isEmpty()){
            Node n= q.poll();
             System.out.print(n.data +" ");
            if(n.left!=null)
              q.add(n.left);
            if(n.right!=null)
              q.add(n.right);        
         }   */
        
}
    