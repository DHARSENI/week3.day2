package week3.day2;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {

	public static void main(String[] args) {
		
			Integer[] arr1 = {3,2,11,4,6,7};
		    Integer[] arr2 = {1,2,8,4,9,7};
		     
		    HashSet<Integer> set = new HashSet<Integer>(); 
		     
		    set.addAll(Arrays.asList(arr1));
		     
		    set.retainAll(Arrays.asList(arr2));
		     
		    System.out.println(set);
		     
		    //convert to array
		    Integer[] intersec = {};
		    intersec = set.toArray(intersec);
		     
		    System.out.println(Arrays.toString(intersec));

	}

}
