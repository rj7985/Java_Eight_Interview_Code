package Logical;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Count_Word_LIST_Of_String {
	
	public static void main(String args[])
	{
		//count the number of times each word appears in a list of strings
		
		List<String>list1=new ArrayList<>();
		
		list1.add("apple");
		list1.add("pineapple");
		list1.add("grape");
		list1.add("banana");
		list1.add("apricot");
		list1.add( "papaya");
		list1.add("mango");
		list1.add("pear");
		list1.add("apple");
		list1.add("banana");
		list1.add("mango");
		list1.add("mango");
		list1.add("mango");
		list1.add("apricot");
		list1.add("apricot");
		list1.add("apricot");
		list1.add("apricot");
		list1.add("apricot");
		
		
		Map<Object, Long>mp=list1.stream()
				.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		System.out.println(mp);
		
	}

}

/*
 * Explanation/Steps:
		1-Convert the list into a stream-->list1.stream()-->Creates a stream of all elements in the list for processing.
		2-Group elements based on the key
			Collectors.groupingBy(x -> x, ...)
			Here the grouping key is x -> x
			Meaning group by the element itself
			All identical values go into the same group.
			Example:
			If list = [apple, mango, apple]
			Groups become:
			apple → [apple, apple]
			mango → [mango]
		3-Count how many items in each group
			Collectors.counting()
			Instead of storing lists inside the map
			It counts occurrences
			Returns a Long count for each key
		4- Collect result into a Map<Integer,Long>
 * */
