package com.example.test.domain.binarytree;

public class BinaryTree {

	private Node root;
	private int calculedSumNode;

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			return current;
		}
		return current;
	}

	private int nodeSum(Node current) {
		if (current == null) {
			return 0;
		}
		nodeSum(current.left);
		nodeSum(current.right);
		calculedSumNode += current.value;
		return calculedSumNode;
	}

	private Node searchNode(Node current, int value) {
		if (current == null) {
			return null;
		}
		if (value == current.value) {
			return current;
		}
		return value < current.value ? searchNode(current.left, value) : searchNode(current.right, value);
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	public int calculeNode(int value) {
		int result = (nodeSum(searchNode(root, value)) - value);
		return result;
	}
}