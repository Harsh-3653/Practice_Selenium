package java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Strings;

public class Test_1 {

	@Test
	public void first() {

		
		/*  ArrayList<String> names = new ArrayList<String>(); names.add("arsh1");
		 names.add("parsh2"); names.add("arsh3"); names.add("harsh4");
		  names.add("marsh55"); int count = 0; for (int i = 0; i < names.size(); i++) {
		  String action = names.get(i); if (action.startsWith("a")) { count++; } }
		  System.out.println(count);
	*/	 
	}

	@Test
	public void Test2()

	{
		/*
		 * ArrayList<String> names = new ArrayList<String>(); names.add("arsh1");
		 * names.add("parsh2"); names.add("arsh3"); names.add("harsh4");
		 * names.add("marsh55");
		 * 
		 * Long c = names.stream().filter(s -> s.startsWith("a")).count();
		 * System.out.println(c);
		 * 
		 * // names.stream().filter(s->s.length()>2).forEach(s->System.out.println(s));
		 * names.forEach(s -> System.out.println(s));
		 */
	}

	@Test
	public void MapStream() {

		
	//	Stream.of("Abhishek","dona","Harsh","Karan","mohit","Aaba").filter(a->a.endsWith("a")).map(s->s.toUpperCase())
	//	.forEach(s->System.out.println(s));
		
		//Array to list
		List<String> arr=Arrays.asList("Abhishek","Don","Harsh","Karan","Mohit","Aaba");
		//arr.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//merging two lists
		
		 ArrayList<String> names = new ArrayList<String>(); names.add("arsh1");
		 names.add("parsh2"); names.add("arsh3"); names.add("harsh4");
		  names.add("marsh55");
		
		  
		  Stream <String> newstring=Stream.concat(arr.stream(), names.stream());
		  
		//  newstring.map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		  
		  //to find any thing
		  
		  boolean flag=newstring.anyMatch(s->s.equalsIgnoreCase("harsh"));
		  Assert.assertTrue(flag);
		  
		  System.out.println(flag);
				  
		  
		  List<Integer> uni=Arrays.asList(2,2,1,3,5,4,3,4,6,7,8,0,6);
		  
		  //sort
		 // uni.stream().sorted().forEach(s->System.out.println(s));
		  
		  //unique
		  
		 uni.stream().distinct().forEach(s->System.out.println(s));
				  
				  
	}

}
