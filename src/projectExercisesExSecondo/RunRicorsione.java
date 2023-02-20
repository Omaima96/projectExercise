package projectExercisesExSecondo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RunRicorsione {

	public static void main(String[] args) {
		
		int[] val = new int[20];
	      
	      System.out.println("Random number array...");
	      
	      for (int i = 0; i < val.length; i++) {
	         val[i] = new Random().nextInt(1000);
	         System.out.println(val[i]);
	      }
	      
	      int min = val[0];
	        int indexMin = 0;
	        for(int i = 0; i < val.length; i++){

	            if(val[i] < min){
	                min = val[i];
	                indexMin = i;

	            }

	        }
	        System.out.println("Minimum value: " + min);

	    	 }
	    
}



