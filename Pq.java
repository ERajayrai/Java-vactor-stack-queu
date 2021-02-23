package VectotrAndStacksAndQueue;

import java.util.PriorityQueue;

public class Pq {
	  public static void main(String args[]) 
	    { 
	        
	        PriorityQueue<Integer> p = new PriorityQueue<Integer>(); 
	  
	       
	        p.add(10); 
	        p.add(20); 
	        p.add(15); 
	  
	        // Printing the top element of PriorityQueue 
	        System.out.println(p.peek()); 
	  
	        // Printing the top element and removing it 
	        // from the PriorityQueue container 
	        //System.out.println(p.poll()); 
	  
	        // Printing the top element again 
	        System.out.println(p.peek()); 
	    }
	  

}
