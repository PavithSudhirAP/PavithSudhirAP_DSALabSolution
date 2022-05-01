package com.gl.javafsd.ds4.binarySearchTree.sumPair;

public class BSTNode {

	private Integer data;	
	private BSTNode leftNode;
	private BSTNode rightNode;
	
	
	public BSTNode(Integer data){
		this.data = data;
	}


	public Integer getData() {
		return data;
	}


	public void setData(Integer data) {
		this.data = data;
	}


	public BSTNode getLeftNode() {
		return leftNode;
	}


	public void setLeftNode(BSTNode leftNode) {
		this.leftNode = leftNode;
	}


	public BSTNode getRightNode() {
		return rightNode;
	}


	public void setRightNode(BSTNode rightNode) {
		this.rightNode = rightNode;
	}
	
	public String toString() {
		return "(" + data + ")";
	}
}
