package com.gl.javafsd.ds4.binarySearchTree.sumPair;

public class BST {

	private BSTNode root;
	
	public BST() {
		root = null;
	}

	public void insert(Integer value) {
		
		root = insert(root, value);
	}

	private BSTNode insert(BSTNode currentNode, Integer value){
		
		if (currentNode == null) {
			return newNode(value);					
		} else if (value <= currentNode.getData()) {
			
			BSTNode newNode = insert(currentNode.getLeftNode(), value);
			
			currentNode.setLeftNode(newNode);
			return currentNode; 
		}else {
			
			BSTNode newNode = insert(currentNode.getRightNode(), value);
			
			currentNode.setRightNode(newNode);
			return currentNode;
		}
	}

	private BSTNode newNode(Integer value) {
	
		BSTNode newNode = new BSTNode(value);
		return newNode;
		
	}
	
	public void preOrderTraversal() {
		
		preOrderTraversal(this.root);
	}
	
	private void preOrderTraversal(BSTNode aNode) {
		
		if (aNode == null) {
			return;
		}
		
		System.out.println(aNode.getData());
		preOrderTraversal(aNode.getLeftNode());
		preOrderTraversal(aNode.getRightNode());
	}
	
	public BSTNode getRoot() {
		return root;
	}
}
