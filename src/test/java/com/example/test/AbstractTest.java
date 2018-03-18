package com.example.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.domain.binarytree.BinaryTree;
import com.example.test.domain.sequence.Sequence;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class AbstractTest {
	
	@Autowired
	protected BinaryTree binaryTree;
	
	@Autowired
	protected Sequence sequence;

}