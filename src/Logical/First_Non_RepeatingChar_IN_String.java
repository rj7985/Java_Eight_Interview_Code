package Logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class First_Non_RepeatingChar_IN_String {
	
	public static void main(String args[])
	{
		//Given a String, find the first non-repeated 
		//character in it using Stream functions.
		
		String s="abcdaabfksijfibc";
		
		Character firstNonRepeated =s.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x->x.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		
		System.out.println( firstNonRepeated);
	}

}

/*Explanation/steps--
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
			.filter(x -> x.getValue() == 1)
			keeps only non-repeated characters.
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



/*Concepts:
 * 
 * Grouping by:The 3-argument version of groupingBy is:public static <T,K,A,D,M extends Map<K,D>> Collector<T,?,M> 
groupingBy(Function<? super T, ? extends K> classifier,
           Supplier<M> mapFactory,
           Collector<? super T,A,D> downstream)
classifier → how to group elements (e.g., Function.identity() to group by the element itself).

mapFactory → which Map implementation to use (e.g., LinkedHashMap::new, TreeMap::new).

downstream → what to do with the grouped elements (e.g., Collectors.counting(), Collectors.toList()).
 */
