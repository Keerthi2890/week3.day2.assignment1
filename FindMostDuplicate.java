package week3.day2.homeassignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMostDuplicate {
	 
	  public void findIt(String str) {  
	        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
	        char[] charArray = str.toCharArray();  
	        for (Character ch : charArray) {  
	            if (baseMap.containsKey(ch)) {  
	                baseMap.put(ch, baseMap.get(ch) + 1);  
	            } else {  
	                baseMap.put(ch, 1);  
	            }  
	        }  
	        Set<Character> keys = baseMap.keySet();  
	        for (Character ch : keys) {  
	            if (baseMap.get(ch) > 1) {  
	                System.out.println(ch);  
	            }  
	        }  
	    } 
	   
	    public static void main(String[] args) {  
	    	FindMostDuplicate dcf = new FindMostDuplicate();  
	        dcf.findIt("abbabb");  
	    } }
	/* input: abbaba
	 * output: b
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * 1) Map -> HashMap 
	 * 2) String -> ch[] -> Get all the character -> occurance
	 * 3) Keep comparing the occurance with other values -> max value -> character
	 * 
	 */

