package demo.examples.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

public class NumbersDemo {

	
	public static void main(String arg[])
	{
		

int a[]={8,9,1,23,3,99,34,45,56,56,100};


//convert array into list of Integers
List<Integer> list=Arrays.stream(a).boxed().collect(Collectors.toList());


//1.find largest number,

list.stream().max(Integer::compareTo).ifPresent(System.out::println);
//2.find second largest,

       list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
//3.square each number
       
       list.stream().map(n->n*n).collect(Collectors.toList()).forEach(System.out::println);
//4.sum all numbers.
       Integer sum=list.stream().reduce(0,Integer::sum);
       System.out.println("sum="+sum);
//5.remove duplicate numbers
       list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
       
//6.seperate odd and even numbers
       System.out.println("===================================");
       list.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::println);
       
       //7.sort all,sort revers
       System.out.println("===================================");
       list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
       System.out.println("===================================");
       
       //8. print first digits of every number
       
       list.stream().map(n->n.toString().charAt(0)).forEach(System.out::println);

       //9. print number which starts with 1
       System.out.println("================================================");
       
       list.stream().filter(n->n.toString().startsWith("1")).forEach(System.out::println);
       
       list.stream().filter(n->String.valueOf(n).startsWith("2")).forEach(System.out::println);
       
     //print all number comma sepeated string
      String newS=list.stream().map(n->String.valueOf(n)).collect(Collectors.joining(","));

      System.out.println("news ="+newS);
	}
	

}
