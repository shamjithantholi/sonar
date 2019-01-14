package com.example.test.junit;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.sample.OddOrEven;
import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SonarTestCases extends TestCase{

	public void testWordCounterSuccess() {
		OddOrEven oddOrEven = new OddOrEven();
		System.out.println("Testing 3........>>>");
		assertEquals(35, oddOrEven.IsEven(6));
		
	}
	public void testWordCounterFail() {
		OddOrEven oddOrEven = new OddOrEven();
		System.out.println("Testing 4........>>>");
		assertEquals(25, oddOrEven.IsEven(7));
		
	}

}
