package Logical;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert_List_Map {
	
	public static void main(String args[])
	{

	/*Convert a list of integers into a map 
	where the key is the integer and the value is its square.*/
		
		List<Integer>list1=new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		
		Map<Integer,Integer>mp=list1.stream()
				.collect(Collectors.toMap(x->x, x->x*x));
		
		System.out.println(mp);
		
		
		/*
		 A)Explanation/Steps:
		  
		  		1-Convert list to stream→ stream() allows functional-style operations.
				
				2-Convert each integer into (key, value) pair
				
						key = integer itself
						
						value = square of that integer
						
				3-Use Collectors.toMap()->Best suited when you want a one-to-one mapping
						toMap(keyMapper, valueMapper) creates
						Map<Integer, Integer>
						
				4- Collect results into a Map
				
		 B)NOte-why not use Grouping by ()
		     groupingBy creates Map<K, List<V>>It groups multiple values under one key.
		 
		 */
		
	
	
	}
}
