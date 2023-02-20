package projectExercisesExPrimo;

import java.util.Arrays;
import java.util.HashSet;

public class ArraysUnion {

	public static void main(String[] args) {

		
		 
	      Integer arr1[] = {12, 13, 5, 16, 9, 19};
	      
	      Integer arr2[] = {16, 2, 60, 9, 8, 5};
	      
	      //Initialize Hashset to perform union operation
	      HashSet<Integer> set = new HashSet<>();
	      
	      //add first array to set
	      set.addAll(Arrays.asList(arr1));
	      
	      //add second array to set
	      set.addAll(Arrays.asList(arr2));
	      
	      //convert to array from set
	      Integer[] union = {};
	      union = set.toArray(union);
	      
	      
	      System.out.println("Union of two arrays is: " + Arrays.toString(union));
	   
	}

}
