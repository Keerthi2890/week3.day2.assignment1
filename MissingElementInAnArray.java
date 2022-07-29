package week3.day2.homeassignments;
import java.util.HashSet;
public class MissingElementInAnArray 
{
	 public static void printMissing(int ar[], int low, int high)
	 {
		 HashSet<Integer> hs = new HashSet<Integer>();
		 for (int i = 0; i < ar.length; i++)
		 hs.add(ar[i]);
		 for (int i = low; i <= high; i++) {
			 if (!hs.contains(i)) {
			 System.out.print(i + " ");
			}
		}
	}
			 
    public static void main(String[] args)
	{
		int arr[] = { 1, 3, 5, 4 };
		 int low = 1, high = 5;
		 printMissing(arr, low, high);
	}
}	

			