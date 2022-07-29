package week3.day2.homeassignments;
import java.util.Map;
import java.util.TreeMap;
public class FindNumberOccurances {	
public static void main(String[] args)
{
	int[] ar = new int[] {2,3,5,6,3,2,1,4,2,1,6,-1};
    Map<Integer, Integer> map = new TreeMap<>(); // TreeMap sorts keys in their natural order
    for(int i : ar) {
        if(!map.containsKey(i)) { // if map doesn't contain currently checked int as a key...
            map.put(i, 1); // put it to map with corresponding value equal to one
        } else { // it this int is already in map...
            map.put(i, map.get(i) + 1); // put it into map with incremented value
        }
    }
    System.out.println(map.entrySet());
}
}


/*
 * Input array numbers, each occurances
 * 
 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
 * 
 * Order: Ascending Order
 * 
 */

/*
 * Psuedcode:
 * 
 * 1) Create Map -> TreeMap
 * 2) For loop -> each number -> add to the map
 * 3) If it is exist -> update it with + 1
 * 	  Else -> new entry with 1 as value
 * 
 */