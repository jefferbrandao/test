package com.example.test.domain.binarytree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.test.AbstractTest;
import com.example.test.domain.binarytree.BinaryTree;

public class BinaryTreeTest extends AbstractTest {

	@Before
	public void setUp() {
		binaryTree = new BinaryTree();
		binaryTree.add(7);
		binaryTree.add(5);
		binaryTree.add(12);
		binaryTree.add(3);
		binaryTree.add(6);
		binaryTree.add(9);
		binaryTree.add(15);
		binaryTree.add(1);
		binaryTree.add(4);
		binaryTree.add(8);
		binaryTree.add(10);
		binaryTree.add(13);
		binaryTree.add(17);
	}

	@Test
	public void shouldCalculeNode12() {
		assertEquals(binaryTree.calculeNode(12), 72);
	}
	
	@Test
	public void shouldCalculeNode7() {
		assertEquals(binaryTree.calculeNode(7), 103);
	}
	
	@Test
	public void shouldCalculeNode10() {
		assertEquals(binaryTree.calculeNode(10), 0);
	}

}
