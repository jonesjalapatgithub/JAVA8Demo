package java8lesson2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.ToIntFunction;

public class Demo {

	private static final String REGEX = null;

	public static void main(String[] args) {
		
		BufferedReader reader1 = null;
		try {
			reader1 = new BufferedReader(new FileReader("D:\\sample.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/*		List<String> output =reader1
				.lines()
				.skip(2)
				.limit(2)
				.flatMap(line -> Stream.of(line.split("v")))
				.filter(word -> word.length() > 0)
				.sorted(Demo::myprinter)
				.peek(System.out::println)
				.collect(Collectors.toList());
		output.stream().forEach(System.out::println);
		*/
/*		List<Integer> integerList=new ArrayList<>(Arrays.asList(1,2,3));
				boolean output1 =integerList
				.stream()
				.anyMatch(i -> i>3);
		System.out.println(output1);
		System.out.println(
		integerList.stream()
		.mapToInt(i -> i)
		.average());*/
		Optional<String> opt=Optional.of("JONes j alapat   ");
		opt.map(String::trim)
		.filter(t -> t.length() > 0)
		.ifPresent(System.out::println);
		
	}
	
	public static int mysort(Integer o1, Integer o2){
			if(o1>o2)
			return 1;
			else if (o1<02) 
			return -1;
			else 
			 return 0;
	}
	
	public static int myprinter(String x,String y) {
		return -1;
	}
	
}
