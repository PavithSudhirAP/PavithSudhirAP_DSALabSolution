package com.gl.javafsd.ds4.binarySearchTree.sumPair;

public class BSTFindSumPairTest {

	public static void main(String[] args) {
		
		test(140);
		test(300);
		test(60);
		test(190);
		test(120);

	}

	private static void test(int sum) {
		
		BST tree = treeSample1();
		
		BSTFindSumPair finder = new BSTFindSumPair(tree);
		
		finder.findPair(sum);
	}
	
	private static BST treeSample1() {
		
		BST tree = new BST();
		
		tree.insert(40);
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(60);
		tree.insert(50);
		tree.insert(70);
		tree.insert(100);
		tree.insert(80);
	
		return tree;
	}
}