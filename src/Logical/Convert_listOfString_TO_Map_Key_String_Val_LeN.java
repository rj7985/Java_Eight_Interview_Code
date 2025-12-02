package Logical;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert_listOfString_TO_Map_Key_String_Val_LeN {
	
	public static void main(String args[])
	
	{
		/*convert a list of strings to a map where key is the 
		string and the value is its length using streams.*/
		List<String>list1=new ArrayList<>();
		
		list1.add("apple");
		list1.add("pineapple");
		list1.add("grape");
		list1.add("banana");
		list1.add("apricot");
		list1.add( "papaya");
		list1.add("mango");
		list1.add("pear");
		
		
		Map<String,Integer>mp=list1.stream()
				.collect(Collectors.toMap(x->x, String::length));
		System.out.println(mp);
	}

}


/*
 Explanation/Steps
 1-Convert list to stream
 2-use collect to collect elem
 3-toMap-->to map elem in key -val format
 4-store result in map
 * 
 */
