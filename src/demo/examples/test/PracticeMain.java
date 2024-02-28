package demo.examples.test;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.*;
import java.util.stream.Collectors;

public class PracticeMain {
	
	public static void main(String args[])
	{
		
		//practice 28 feb 2024
		
		String s= "fly fly flow flight abt abz Abc Av flyzone";
		//convert string into list of strings
		
		List<String> list=Arrays.asList(s.split("\\s"));

		//1 print most repeated word.
		
		list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey).ifPresent(System.out::println);
		
		//2 print first letter most repeated.
		
		list.stream().collect(Collectors.groupingBy(n->String.valueOf(n.charAt(0)).toLowerCase(),Collectors.counting()))
		 .entrySet().stream().max(Map.Entry.comparingByValue())
		 .map(Map.Entry::getKey).ifPresent(System.out::println);
		
		//3 print word  with max length.
		
		list.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);
		
		//4 count number of words
		
		System.out.println("no of words="+list.size());
		//5 create map word=length of word
		Map<String,Integer> m1=list.stream().collect(HashMap::new,(map,str)->map.put(str,str.length()),HashMap::putAll);
		System.out.println("map is ="+m1);
		//6 print most repeated char
		System.out.println("---------------------------------------");
		List<Character> clist=s.replace(" ","").chars().mapToObj(n->(char)n).collect(Collectors.toList());
		
		clist.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet()
		              .stream().max(Map.Entry.comparingByValue())
		             .map(Map.Entry::getKey).ifPresent(System.out::println);
		
		              
		
		
		//7 join all words by '-'
		System.out.println("---------------------------------------");
		
		String news=list.stream().collect(Collectors.joining(","));
		System.out.println(" new string is ="+news);
		//8 reverse string
		
		//9 make first char of every word capital
		System.out.println("---------------------------------------");
		list.stream().map(n->n.substring(0,1).toUpperCase()+n.substring(1))
		             .collect(Collectors.toList()).forEach(System.out::println);
		
		  //10 count occurrence  of the pattern fly
		    Pattern pattern=Pattern.compile("\\bfly");
		    
		  long count=  list.stream().map(n->pattern.matcher(n).find()?1:0).reduce(0,Integer::sum);
		  System.out.println("pattern fly found in "+count +" times");
		    //11 count occurrence of the word fly
		  System.out.println(" fly found =  "+ list.stream().filter(n->n.equals("fly")).count() +" times");
		 
		  
	///numbers ques
		  
		  int a[]={1,2,34,3,45,56,65,56,100};

		//convert array into list of Integers
        List<Integer> numList=Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(" num list="+numList);
		//1.find largest number,
        
        numList.stream().distinct().max(Integer::compareTo).ifPresent(System.out::println);
    	System.out.println("---------------------------------------");
		//2.find second largest,
    	
    	numList.stream().distinct().sorted(Comparator.reverseOrder())
    	.limit(2)
    	.skip(1).forEach(System.out::println);
   
		//3.square each number
    	System.out.println("---------------------------------------");
    	numList.stream().map(n->n*n).collect(Collectors.toList()).forEach(System.out::println);
		//4.sum all numbers.
    	System.out.println("---------------------------------------");
    	numList.stream().count();
    	System.out.println("number of items is "+numList.stream().count());
    
    	
    	System.out.println("sum o of all items is"+numList.stream().reduce(0,Integer::sum));
		//5.remove duplicate numbers, make another collection
        List<Integer> numList2=numList.stream().distinct().collect(Collectors.toList());
    	Set<Integer> numListSet=numList.stream().collect(Collectors.toSet());
    	System.out.println("new List is "+numList2);//insertion oder maintained
    	System.out.println("Set is "+numListSet); //random
		//6.seperate odd and even numbers
    	   //two groups of odd and even numbers
    	
    	Map<String, List<Integer>> map1=numList.stream().distinct().collect(
    			Collectors.groupingBy(num->num%2==0?"even":"odd"));
    	
    	System.out.println(map1);
		//7.sort all,sort revers
    	System.out.println("---------------------------------------");
    	numList.stream().sorted().forEach(System.out::println);
    	numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//8. print first digits of every number
    	System.out.println("---------------------------------------");
    	numList.stream().map(n->String.valueOf(n).substring(0,1)).forEach(System.out::println);
    	
		//9. print number which starts with 1
    	System.out.println("---------------------------------------");
    	numList.stream().filter(n->String.valueOf(n).startsWith("1")).forEach(System.out::println);
    	
		 //10 print all number comma sepeated string
    	numList.stream().map(n->String.valueOf(n)).collect(Collectors.joining(","));
          //11. print all numbers greater that 35
          numList.stream().filter(n->n>35).forEach(System.out::println);
    	
    	

		/// non stream api question
        
		//find two string anagram
          String s1="hello";
          
          String s2="LLoeH";
      	System.out.println("s1 and s2 anagram ?="+findAnagram(s1, s2));
		//find largest number : 
      	
      	System.out.println("---------------------------------------");
      	 int b[]={1,2,34,3,45,56,65,56};
      	
     	System.out.println(" largest number is "+findLargestNumber(b));
		// find second largest number 
    	
     	System.out.println("2nd  largest number is "+findSecondLargest(b));
       //   Check if given String is Pangram or not
          //reverse order of words in the sentence
	
		
	}
	
	 static boolean findAnagram(String one,String two)
	{
		
		if(one== null || two == null ) return false;
		if(one.length() != two.length()) return false;
		
		one=one.toLowerCase();
		two=two.toLowerCase();
		
		for(int i=0;i<one.length();i++)
		{
			
			if(two.contains(String.valueOf(one.charAt(i))))
			{
				continue;
			}else
				return false;
		}
		
		return true;
	}
	 
	 static int findLargestNumber(int[] a)
	 {
		 int largest=a[0];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]>largest)
			 {
				 largest=a[i];
			 }
		 }
		 
		 return largest;
	 }
	 
	 static int findSecondLargest(int[] a)
	 {
		 int largest=a[0];
		 int secondLarge=a[0];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]>largest)
			 {
				 secondLarge=largest;
				 largest=a[i];
				
			 }
			 else if(a[i]>secondLarge && a[i]<largest)
			 {
				 secondLarge=a[i];
			 }
		 }
		 
		 
		 
		 return secondLarge;
	 }

}
