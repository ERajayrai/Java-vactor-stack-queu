package VectotrAndStacksAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueExmple2 {
	 public static void main(String args[]) {
	      Deque<String> s = new ArrayDeque<String>();
	      //=<String> q = new ArrayDeque<String>();
	      // stack
	      s.push("Bat");
	      s.push("Mat");
	      s.push("Cat");
	      s.push("Rat");
	      s.push("Hat");
	      s.push("Fat");
	      while (!s.isEmpty())
	         System.out.print(s.pop() + " ");
	      System.out.print("\n");
	      // queue
	      q.add("Bat");
	      q.add("Mat");
	      q.add("Cat");
	      q.add("Rat");
	      q.add("Hat");
	      q.add("Fat");
	      while (!q.isEmpty())
	         System.out.print(q.remove() + " ");
	   }

}
