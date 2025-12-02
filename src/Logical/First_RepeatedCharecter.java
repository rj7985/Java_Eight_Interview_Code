package Logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class First_RepeatedCharecter {
	
	public static void main(String args[])
	{
		//Q-Find first non repeating character.
		
		String s="abcdaabfksijfibc";
		
	Character ch=	s.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()>1)
		.map(Map.Entry::getKey)
		.findFirst()
		.orElse(null);
	
	
	System.out.println(ch);
	}
	
	

}


/*
 * Explanation/steps--
		1-️s.chars()
			Converts the string into a stream of Unicode integers.
			Return type: IntStream
		2-️.mapToObj(c -> (char) c)
			Converts each int to a Character.
			Return type: Stream<Character>
		3-Group characters while keeping original insertion order
			.collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
			Grouping key: the character itself (x -> x)
			Map implementation: LinkedHashMap → preserves order of appearance
			 Downstream collector: counting() → counts how many times each character appears
		     Return type: LinkedHashMap<Character, Long>
		4-Convert map entries to a stream
		 	.entrySet().stream()
			Allows filtering through key/value pairs.
			Return type: Stream<Map.Entry<Character,Long>>
		5-Filter characters that appear only once
			.filter(x -> x.getValue() > 1)
			keeps only repeated characters.
			Return type: same stream with filtered entries.
		6- Extract the character key
			.map(Map.Entry::getKey)
			Converts Entry<Character,Long> → Character
			Return type: Stream<Character>
		7-Get the first non-repeated char
			.findFirst()
			Returns the first element based on original order (because of LinkedHashMap).
			Return type: Optional<Character>
		8-Handle the case where no unique character exists
			.orElse(null)
			Returns the character if present; otherwise null.
			Return type: Character
 */

 