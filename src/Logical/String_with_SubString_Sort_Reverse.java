package Logical;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Q1-Filter a list of strings to find all elements that contain a 
specific substring and then sort them in reverse order? */

public class String_with_SubString_Sort_Reverse {
	
	public static void main(String args[]) {
	/*Q1-Filter a list of strings to find all elements that contain a 
	specific substring and then sort them in reverse order? */
	List<String>list1=new ArrayList<>();
	
	list1.add("apple");
	list1.add("pineapple");
	list1.add("grape");
	list1.add("banana");
	list1.add("apricot");
	list1.add( "papaya");
	list1.add("mango");
	list1.add("pear");
	
	String subString="ap";
	
	
	List<String>ans1=list1.stream().filter(x->x.contains("ap")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
	System.out.println(ans1);
	
	}
	
	
		/*
		 * Explanation:
		 * 
		    1. stream()Converts the list into a Stream so operations can be applied.
			
			2. filter() – Intermediate Operation
			
			Keeps only elements that contain "ap".
			
			Used for filtering elements based on a condition.
			
			3. sorted(Comparator.reverseOrder()) – Intermediate Operation
			
			Sorts elements in descending (reverse) natural order.
			
			Comparator.reverseOrder() is a built-in comparator that automatically reverses the usual ascending sorting order.
			
			No need to write a custom comparator like (a, b) -> b.compareTo(a).
			
			4. collect(Collectors.toList()) – Terminal Operation
			
			Collects the final processed elements into a List.
			
			Ends the stream pipeline.
				
				 * 
				 * 
				 * */
	 
	
	 
	

}
