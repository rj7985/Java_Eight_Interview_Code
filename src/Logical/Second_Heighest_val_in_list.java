package Logical;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Second_Heighest_val_in_list {
	
	public static void main(String args[])
	{
		//Find the second highest value in a list of integers using streams.
		
		List<Integer>ls1=Arrays.asList(1,2,3,5,6,7,8);
		
          int  num=ls1.stream()
        		  .sorted()
        		  .skip(1)
        		  .findFirst()
        		  .orElseThrow(()->new NoSuchElementException("Elem not there"));
		
		System.out.println(num);
	}

}


/*
 Explanation/steps:
	 1- Convert the list into a stream-->Creates a stream of the list elements for processing.
	          Return Type: Stream<Integer>
	 2-Sort the elements in natural order (ascending)-->Arranges the numbers from smallest → largest.
	          Return Type: Stream<Integer>
	 3-Skip the first element:Skips the smallest element, making the next element the second smallest.
	          Return Type: Stream<Integer>
	 4-Retrieve the next available element--> Fetches the first number after skipping one element.
	          Return Type: Optional<Integer>
	
	5-Handle the case where the element doesn’t exist--> .orElseThrow(() -> new NoSuchElementException("Elem not there"))
	      Returns the value if present, otherwise throws an exception.
	       Return Type: Integer
	6-Store and print the resultThe final retrieved value (second smallest) is stored in num and printed.
 */
