
import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueue1 {


  
    public static void main(String[] args) 
    {  

    int size=5;
    Collection<Integer> c = new ArrayList<Integer>();
    Random rand = new Random();
      for(int i=0; i<size; i++) 
      {
          c.add(rand.nextInt(10*size));
      }
    PriorityQueue<Integer> p = new PriorityQueue<Integer>(c);
     
     System.out.println(p);
     

     /*   while(p.size()>=0)
      {
        System.out.println(p.remove());
      } 
    */

       }

 
}
