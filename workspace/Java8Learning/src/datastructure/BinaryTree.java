/**
 * 
 */
package datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ravishukla
 *
 */
public class BinaryTree {

	Node root;

	public class Node {
		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			left = null;
			right = null;

		}

	}

	private Node addRecurciveNode(Node current, int value)
	{
		if (current == null){
//			System.out.println("Root " + value);
			return new Node(value);
		}
		else if (current.data < value)
		{
//			System.out.println("Adding right " + value);
			current.right = addRecurciveNode(current.right, value);
		}
		else if (current.data > value)
		{
//			System.out.println("Adding left " + value);
			current.left = addRecurciveNode(current.left, value);
		}
		else
		{
			System.out.println("current " + value);
			return current;
		}

		return current;
	}


	public void addNode(int data)
	{
		root = addRecurciveNode(root, data);
	}

	private void printPreNode(Node current){
		if (current != null){
			System.out.print(" " +current.data);
			printPreNode(current.left);
			printPreNode(current.right);
		}
		else
		{
//			System.out.println("Node is null");
		}

	}

	public void print()
	{
		printPreNode(root);
	}
	
	public void traverseLevelOrder() {
	    if (root == null) {
	        return;
	    }
	 
	    Queue<Node> nodes = new LinkedList<Node>();
	    nodes.add(root);
	 
	    while (!nodes.isEmpty()) {
	 
	        Node node = nodes.remove();
	 
	        System.out.print(" " + node.data);
	 
	        if (node.left != null) {
	            nodes.add(node.left);
	        }
	 
	        if (node.right != null) {
	            nodes.add(node.right);
	        }
	    }
	}


	private Node deleteNodeFromTree(Node current, int value)
	{
		if(current == null)
			return null;		
		if (current.data == value)
		{
			if(current.right == null && current.left == null)
				return null;

			if(current.right == null)
				return current.left;
			if(current.left == null)
				return current.right;
			int smallValue= returnSmallest(current.right);
			current.data = smallValue;
			current.right = deleteNodeFromTree(current.right, smallValue);
			return current;
		}
		if(current.data > value)
		{
			current.left = deleteNodeFromTree(current.left, value);
			return current;
		}
		current.right = deleteNodeFromTree(current.right, value);
		return current;
	}
	
	
	private int returnSmallest(Node current){
		return current.left == null ? current.data : returnSmallest(current.left);
	}
	

	
	public void delete(int value){
		deleteNodeFromTree(root, value);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree bt= new BinaryTree();

		bt.addNode(50);
		bt.addNode(40);
		bt.addNode(55);
		bt.addNode(45);
		bt.addNode(35);
		bt.addNode(30);
		bt.addNode(32);
		bt.addNode(39);
		bt.addNode(37);
		bt.addNode(139);
		bt.addNode(239);
		bt.addNode(75);
		bt.addNode(65);
		System.out.println("\n=====================");
		bt.print();

		System.out.println("\n=====================");
//		bt.delete(35);
//		bt.print();

		bt.traverseLevelOrder();
		
	}

}
