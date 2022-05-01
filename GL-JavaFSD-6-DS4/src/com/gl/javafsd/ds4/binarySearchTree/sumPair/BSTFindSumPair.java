package com.gl.javafsd.ds4.binarySearchTree.sumPair;

import java.util.LinkedHashSet;
import java.util.Set;

public class BSTFindSumPair {

	private BST tree;
	private boolean found =  false;
	
	public BSTFindSumPair(BST tree) {
		
		this.tree = tree;
	}
	
	public void findPair(int sum) {
		
		Set<Integer> nodes = new LinkedHashSet<Integer>();
		
		findPairInternal(sum, tree.getRoot(), nodes);
	
		if (!found) {
			System.out.println("For the sum "+ sum + ", node pairs are NOT found\n");
		}
	}
	
	private boolean findPairInternal(int sum, BSTNode aNode, Set<Integer> nodes) {
		
		if (aNode == null) {
			return false;
		}

		found = findPairInternal(sum, aNode.getLeftNode(), nodes);
		if (found) {
			return true;
		}

		int difference = sum - aNode.getData();
		
		if (nodes.contains(difference)) {
			
			found = true;
			System.out.println("For the sum " + sum + ", node pairs are (" + aNode.getData() + ") and (" + difference + ")\n");
			return found;
		}else {

			nodes.add(aNode.getData());											
		}		
		
		if (!found) {
			return findPairInternal(sum, aNode.getRightNode(), nodes);
		}else {
			return true;
		}
	}

}