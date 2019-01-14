package com.example.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.test.sample.SimpleWordCounter;

public class SonarTestCases {

	@Test
	public void testWordCounter() {
		SimpleWordCounter simpleWordCounter = new SimpleWordCounter();
		System.out.println("Testing ........>>>");
		assertEquals(25, simpleWordCounter.CountWordsInFile());
	}

}
