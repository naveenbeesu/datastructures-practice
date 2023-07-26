package com.java.datastructures.nonlinear;

class Node {
	int item;
	Node left, right;
	public Node(int key) {
		this.item = key;
		left = right = null;
	}
}
public class BinarySearchTree {

	Node root;
	BinarySearchTree(){
		root = null;
	}
	void postorder(Node node) {
	
		if(node == null) {
				return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.item + "->");
	}
	
	void preorder(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.item + "->");
		preorder(node.left);
		preorder(node.right);		
	}
	void inorder(Node node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.println(node.item + "->");
		inorder(node.right);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(6);
		System.out.println("InOrder Traversal");
		tree.inorder(tree.root);
		System.out.println("Pre Order Traversal");
		tree.preorder(tree.root);
		System.out.println("Post Order Traversal");
		tree.postorder(tree.root);

	}

}
