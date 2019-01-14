package com.example.test.junit;

import com.example.test.sample.SimpleWordCounter;

import junit.framework.TestCase;

public class SonarTestCases extends TestCase{

	public void testWordCounterSuccess() {
		SimpleWordCounter simpleWordCounter = new SimpleWordCounter();
		System.out.println("Testing 1........>>>");
		assertEquals(35, simpleWordCounter.CountWordsInFile());
		
	}
	public void testWordCounterFail() {
		SimpleWordCounter simpleWordCounter = new SimpleWordCounter();
		System.out.println("Testing 21........>>>");
		assertEquals(25, simpleWordCounter.CountWordsInFile()); 
		
	}

}
