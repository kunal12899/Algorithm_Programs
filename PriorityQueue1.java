
import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueue1 {


   private static long startTime, endTime, elapsedTime;
   private static int phase = 0;

     public static void timer()
    {
        if(phase == 0) {
        startTime = System.currentTimeMillis();
        phase = 1;
    }    else {
          endTime = System.currentTimeMillis();
            elapsedTime = endTime-startTime;
            System.out.println("Time: " + elapsedTime + " msec.");
            phase = 0;
        }
    }
  
    public static void main(String[] args) 
    {  

    int size=1000002;
    Collection<Integer> c = new ArrayList<Integer>();
    Random rand = new Random();
      for(int i=0; i<size; i++) 
      {
          c.add(rand.nextInt(10*size));
      }
    PriorityQueue<Integer> p = new PriorityQueue<Integer>(c);
          
        timer();
       while(p.size()>0)
      {
        System.out.println(p.poll());
      } 

        timer();
       } 
}
