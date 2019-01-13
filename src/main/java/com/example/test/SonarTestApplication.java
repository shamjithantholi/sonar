package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.test.sample.IsALeapYear;
import com.example.test.sample.OddOrEven;
import com.example.test.sample.ReverseTheString;
import com.example.test.sample.SimpleWordCounter;

@SpringBootApplication
public class SonarTestApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SonarTestApplication.class, args);
		
		SimpleWordCounter simpleWordCounter = new SimpleWordCounter();
		
		int count = simpleWordCounter.CountWordsInFile();
		
		System.out.println("ret value >>>> "+count);
		
		OddOrEven oddOrEven = new OddOrEven();
		boolean isEven = oddOrEven.IsEven(5);
		
		System.out.println("isEven >> "+ isEven);
		
		System.out.println("reverse the string >> "+ ReverseTheString.reverseString("testing"));
		
		IsALeapYear isLeapYear = new IsALeapYear();
		int year = 1999;
		boolean isLeap = isLeapYear.checkLeapYear(year);
		if(isLeap==true)
	        System.out.println(year + " is a Leap Year.");
	    else
	        System.out.println(year + " is not a Leap Year.");
		
	}

}

