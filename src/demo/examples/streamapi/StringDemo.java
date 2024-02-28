package demo.examples.streamapi;

import java.util.stream.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class StringDemo {
	
	public static void main(String arg[]){
		
		String s = "fly fly flow flight abt abz flyzone";
		List<String> list1= Arrays.asList(s.split(" "));
		
	//1 print most repeated word
	//List<String> list1 = Arrays.asList("fly", "fly","flow", "flight", "abc", "abz");
		
   String ch=	list1
	.stream()
	.collect(Collectors.groupingBy(n->n,Collectors.counting()))
	.entrySet().stream().max(Map.Entry.comparingByValue())
	.map(Map.Entry::getKey)
	.orElse(null);

	System.out.println("output is ="+ch);
	
	
	//2 print first letter most repeated
	
	  Character cha=list1.stream().collect(Collectors.groupingBy(n->n.charAt(0),Collectors.counting()))
			  .entrySet().stream().max(Map.Entry.comparingByValue())
			  .map(Map.Entry::getKey)
			  .orElse(null);
	  
		System.out.println("output is ="+cha);
		
		
		//3 print string with max length
		
		list1.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);
		
		  //count occurance of the pattern fly
	       Pattern pattern=Pattern.compile("\\bfly", Pattern.CASE_INSENSITIVE);


	   
	       long cc = Stream.of(s.split("\\s+"))
	               .map(word -> pattern.matcher(word).find() ? 1 : 0)
	               .reduce(0, Integer::sum);
	
     }

}
