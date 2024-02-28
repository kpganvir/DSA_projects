package demo.examples.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class DemoMain {
	//interview question practice
	
	public static void main(String args[])
	{
		String s= "fly fly flow flight abt abz flyzone";
		//convert string into list of strings
          List<String> slist=Arrays.asList(s.split("\\s"));
		
		//1 print most repeated word.
          
         Arrays.asList(s.split("\\s")).stream()
                            .collect(Collectors.groupingBy(n->n,Collectors.counting()))
                            .entrySet().stream().max(Map.Entry.comparingByValue())
                            .map(Map.Entry::getKey).ifPresent(System.out::println);
                            
          
          
          
		//2 print first letter most repeated.
         
         
		//3 print word  with max length.
		//4 count number of words
		//5 create map word=length of word
		//6 print most repeated char
      
       List<Character> clist=s.replace(" ","").chars()
    		   .mapToObj(n->(char)n).collect(Collectors.toList());
       
              		 
        	
         clist.stream()
         .collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream()
          .max(Map.Entry.comparingByValue())
          .map(Map.Entry::getKey)
          .ifPresent(System.out::println);
         
         System.out.println("--------------");
         
		//7 join all words by '-'
		// reverse string
		// make first char of every word capital
         
       String snew=  Arrays.asList(s.split("\\s"))
       .stream().map(n->n.substring(0,1).toUpperCase()+n.substring(1))
                                             .collect(Collectors.joining(" "));
       System.out.println("new sentence ="+snew);
         
        // find matching string fl                     
		//find now many times pattern fly there
         
        long t=Arrays.asList(s.split("\\s")).stream().filter(n->n.equals("fly")).count();
       System.out.println("t="+t);
           // find only words ending with y..how many times.                 
		
       
    
       // Split the string into words
       String[] words = s.split("\\s+");

       // Count occurrences of the word "fly" (case insensitive)
       long count = Stream.of(words)
                       .map(String::toLowerCase)
                       .filter(word -> word.equals("fly"))
                       .count();

       System.out.println("Number of words of 'fly': " + count);
       
       
       //count occurance of the pattern fly
       
       Pattern pattern=Pattern.compile("\\bfly", Pattern.CASE_INSENSITIVE);


       Matcher matcher = pattern.matcher(s);
       long cc = Stream.of(s.split("\\s+"))
               .map(word -> pattern.matcher(word).find() ? 1 : 0)
               .reduce(0, Integer::sum);

       
       
       System.out.println("Number of occurrences of 'fly': " + cc);
       
	}

}
