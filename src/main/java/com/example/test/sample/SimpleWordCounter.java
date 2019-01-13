package com.example.test.sample;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SimpleWordCounter 
{
	public int CountWordsInFile() 
	{
		int totalWords = 0;
		Scanner sc = null;
		try 
		{
			File f = new File("test.txt");
        
			sc = new Scanner(f);
			Map<String, Integer> wordCount = new TreeMap<String, Integer>();
			while(sc.hasNext()) 
			{
				String word = sc.next();
				if(!wordCount.containsKey(word))
					wordCount.put(word, 1);
				else
					wordCount.put(word, wordCount.get(word) + 1);
			}
        
        System.out.println(wordCount.size());
        totalWords = wordCount.size();
    }
    catch(IOException e) {
        System.out.println("Unable to read from file.");
    }finally {
    	sc.close();
    }
	return totalWords;
	}
}
