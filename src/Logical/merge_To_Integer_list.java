package Logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class merge_To_Integer_list {
	
	public static void main(String args[])
	{
		/*merge two lists of integers, remove duplicates, 
		 and find the average of the remaining numbers. 
		  */
		
		List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50, 20);
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 70, 80);
        
        double ans=Stream.concat(list1.stream(), list2.stream()).distinct()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
        
        System.out.println(ans);

	}

}

/*
 Explanation/Steps:
   
			 1- Convert both lists to streams
			   list1.stream()
			   list2.stream()
			   These represent the elements of each list.
			
			2-Combine both streams using Stream.concat()
			  Merges the two lists into one stream.
			
			3-Remove duplicate values using distinct()
			 Ensures only unique integers are used for the calculation.
			
			4-Convert Stream<Integer> to IntStream
			 mapToInt(Integer::intValue)
			 Required for numeric operations like average().
			
			5-Calculate the average
			 .average() returns an OptionalDouble.
			
			6-Provide default value if stream is empty
			 .orElse(0.0) ensures the program returns 0.0 instead of error.
			
			7-Store and print the result
			 double ans = ...
			 System.out.println(ans);
 */
