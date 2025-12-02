package Logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partioningBy_Even_ODD {
	
	public static void main(String args[])
	{
		/*partition a list of numbers into two groups: 
		even and odd numbers using streams.*/
		
		List<Integer>ls1=Arrays.asList(1,3,2,4,5,7,8,9,88,33);
		
		Map<Boolean,List<Integer>>mp=ls1.stream()
				.collect(Collectors.partitioningBy(x->x%2==0));
		
		System.out.println(mp);
	}

}

/*
 Explanation/Steps:
 1-Converts the list into a stream so elements can be processed using stream operations.
              Return Type: Stream<Integer>
 2-partitioningBy() splits the stream into two groups based on a boolean condition.
		Condition: x % 2 == 0
		true → even numbers
		false → odd numbers
		
		Creates two lists:
		true → List of even numbers
		false → List of odd numbers
		
		Return Type:
		Map<Boolean, List<Integer>>
		Key → true or false
		Value → list of integers matching that partition
3-Store the final partitioned map
	The map contains two entries:
	true : [all even numbers]
	false : [all odd numbers]
	 
 
 */
