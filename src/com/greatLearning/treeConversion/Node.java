package com.greatLearning.treeConversion;
import java.io.*;


public class Node
{
	int data;
	public Node left;
	public Node right;
	
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}