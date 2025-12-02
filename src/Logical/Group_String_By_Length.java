package Logical;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_String_By_Length {

	
	public static void main(String args[])
	{
	 //Q-group a list of strings by their length and collect the result into a map.
		
		List<String>list1=new ArrayList<>();
		
		list1.add("apple");
		list1.add("pineapple");
		list1.add("grape");
		list1.add("banana");
		list1.add("apricot");
		list1.add( "papaya");
		list1.add("mango");
		list1.add("pear");
		
		Map<Integer,List<String>>mp=list1.stream()
				.collect(Collectors.groupingBy(String::length));
		
		System.out.println(mp);
		
		
		
		
	}
	 
}

/*
 Explanation/Steps:
		 1-Create a list of strings-->Contains various fruit names.
		
		 2-Convert list into a stream->Using list1.stream() to process elements.
		
		 3-Use groupingBy() to classify elements-->groupingBy(String::length) groups strings based on their length.Each unique length becomes a key in the map.
		
		 4-Collector creates a Map<Integer, List<String>>
			key → string length
			value → list of strings having that length
		
		 5-Collect result into a map-->collect(Collectors.groupingBy(...)) 
		 		produces the final grouped map.
		
		 6->Print the grouped result
 */
