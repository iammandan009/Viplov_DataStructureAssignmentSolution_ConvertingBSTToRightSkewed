package com.greatLearning.main;
import com.greatLearning.treeConversion.*;

public class Driver {

	public static void main(String[] args) 
	{
	    Node node;
		TreeConversionOperations conversion = new TreeConversionOperations();
		node = new Node(50);
		node.left = new Node(30);
		node.right= new Node(60);
		
		node.left.left = new Node(10);
		
		node.right.left= new Node(40);
		
		conversion.flattenBSTToRightSkewed(node);
		conversion.sortElementsForCreatingSkewedTree();
		conversion.createSkewedTree();		 

	}

}
