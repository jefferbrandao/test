package com.example.test.application.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.test.domain.binarytree.BinaryTree;
import com.example.test.domain.sequence.Sequence;

@Configuration
public class BeanConfig {
	@Bean
	public BinaryTree binaryTree() {
		return new BinaryTree();
	}

	@Bean
	public Sequence sequence() {
		return new Sequence();
	}
}
