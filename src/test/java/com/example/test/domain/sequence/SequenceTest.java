package com.example.test.domain.sequence;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.test.AbstractTest;

public class SequenceTest extends AbstractTest {

	@Before
	public void setUp() {
		sequence = new Sequence();
	}

	@Test
	public void shouldGreaterThan1000000() {
		assertEquals(sequence.calcule(10256, 512), -1);
	}

	@Test
	public void shouldEquals121212() {
		assertEquals(sequence.calcule(111, 222), 121212);
	}

	@Test
	public void shouldEquals12122() {
		assertEquals(sequence.calcule(11, 222), 12122);
	}

	@Test
	public void shouldEquals12121() {
		assertEquals(sequence.calcule(111, 22), 12121);
	}

}
