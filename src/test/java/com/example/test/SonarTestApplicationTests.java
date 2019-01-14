package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.sample.SimpleWordCounter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SonarTestApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testWordCounterSuccess() {
		SimpleWordCounter simpleWordCounter = new SimpleWordCounter();
		System.out.println("Testing 1........>>>");
		assertEquals(35, simpleWordCounter.CountWordsInFile());
		
	}
	@Test
	public void testWordCounterFail() {
		SimpleWordCounter simpleWordCounter = new SimpleWordCounter();
		System.out.println("Testing 2........>>>");
		assertEquals(25, simpleWordCounter.CountWordsInFile());
		
	}
	@Test
	public void testWordCounterFail() {
		SimpleWordCounter simpleWordCounter = new SimpleWordCounter();
		System.out.println("Testing 3........>>>");
		assertEquals(26, simpleWordCounter.CountWordsInFile());
		
	}
}

