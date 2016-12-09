package java8start;

import java.util.ArrayList;
import java.util.List;

public class java8demo {

	public static void main(String[] args) {
		
		//pass by method
		
//		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
//		values.forEach(i -> doubleit(i));
		

/*		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		values.forEach(java8demo::doubleit);*/
		List<Integer> values=new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			values.add(i);
		}
		//values.stream().forEach(System.out::println);
		//values.parallelStream().forEach(System.out::println);
		int j=values.stream().filter(i -> {
			System.out.println("hi");
			return true;
		}).findFirst().orElse(0);
		System.out.println(j);
	}
	
	static void doubleit(int i){
		System.out.println(i*i);
	}
}
