package Logical;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lonest_String {
	
	public static void main(String args[])
	{
		//find the longest string in a list of strings using streams.
		
		List<String>list1=new ArrayList<>();
		
		list1.add("apple");
		list1.add("pineapple");
		list1.add("grape");
		list1.add("banana");
		list1.add("apricot");
		list1.add( "papaya");
		list1.add("mango");
		list1.add("pear");
		
		
		String res=list1.stream()
				.max(Comparator.comparingInt(String::length))
				.orElse(null);
	
		System.out.println(res);
	}

}

/*
 Explanation/steps:
 
		1. Convert the list into a stream
			Meaning: Turns the list of strings into a stream for processing.
			Return Type: Stream<String>
		2. Find the longest string using max()
		 Meaning:-->max() finds the maximum element based on the provided comparator.
		 Comparator used: comparingInt(String::length)
		  → compares strings by their length.
		  So, max() returns the string with the greatest length.
		  Return Type: Optional<String>
		
		3.orElse(null)- Handle the case where list may be empty
		  Extracts the longest string from the Optional
		  If list is empty, returns null instead of throwing an exception.
		  Return Type: String
		
		4. Store and print the result
		The final value stored in res is the longest string from the list.
 */



/*Concepts:
 
 similar methods like max--
 
1-max(Comparator)	gives largest element	and return Optional<T>
2- min(Comparator)	gives smallest element	and return Optional<T>
3- count()	gives count of elements	and return long
4- findFirst()	gives first element	and return Optional<T>
5- findAny() gives any element	and return Optional<T>
6-reduce() gives 	custom aggregation	and returns Optional<T>

 */





/*
 custom aggregation:
 
 Def-->Custom aggregation means combining stream elements into a single result 
	 using your own logic instead of built-in collectors like sum(), max(), or count().
	In Streams, custom aggregation is done using:
	
	✔ reduce()
	✔ collect() (with custom Collector)
	
	These allow you to accumulate values using your own formula.
	 
 
 EG1-:Example: Find product of all numbers
(Java has no built-in product() method — this is custom aggregation)

		List<Integer> nums = List.of(2, 3, 4, 5);
		
		int product = nums.stream()
		        .reduce(1, (a, b) -> a * b);
		
		System.out.println(product);  // 120
	

 How it works

Identity = 1

Lambda (a, b) -> a * b multiplies all numbers

Result = single integer


EG2-2. Custom Aggregation: Count Characters of All Words
List<String> words = List.of("apple", "banana", "kiwi");

int totalChars = words.stream()
        .map(String::length)
        .reduce(0, Integer::sum);

System.out.println(totalChars);  // 15

 
 */


