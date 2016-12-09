package java8start;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class java8Demo3 {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(12,20,35,46);
		
		Predicate<Integer> p = new Predicate<Integer>(){

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%5==0;
			}
		};
		System.out.println(values.stream()
				.filter(p)
				.map(i -> i*2)
				.findFirst()
				.orElse(0));
		
		values.stream().max((o1,o2)-> o1>o2?o1:o2);
		
		
	
			
		
		
		
		
	}
}
