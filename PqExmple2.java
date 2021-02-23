package VectotrAndStacksAndQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PqExmple2 {
	public static void main(String args[]) 
    { 
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
  
        pq.add(64); 
        pq.add(26); 
        pq.add(23); 
        pq.add(56);
        pq.add(24);
       
        pq.getClass();
        pq.containsAll(pq);
  
        Iterator<Integer> iterator = pq.iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.print(iterator.next() + " ");
            
        }
        
        
       // System.out.print( );

    }

}
