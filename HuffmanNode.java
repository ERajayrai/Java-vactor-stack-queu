package VectotrAndStacksAndQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class  HuffmanNode {
	 int item;
	  char c;
	  HuffmanNode left;
	  HuffmanNode right;
	}

	// For comparing the nodes
	class ImplementComparator implements Comparator<HuffmanNode> {
	  public int compare(HuffmanNode x, HuffmanNode y) {
	    return x.item - y.item;
	  }
	}



