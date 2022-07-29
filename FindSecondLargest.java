package week3.day2.homeassignments;
import java.util.*;
public class FindSecondLargest {	
	public static int getSecondLargest(Integer[] data, int total)
	{  
	List<Integer> list= Arrays.asList(data);
	Collections.sort(list);  
	int element=list.get(total-2);  
	return element;  
	}  
	public static void main(String args[]){  
		Integer[] data = {3,2,11,4,6,7};
		System.out.println("Second Largest: "+getSecondLargest(data,6));  
	
	}
	}  
		
