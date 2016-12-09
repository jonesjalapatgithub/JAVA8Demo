package java8start;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Java8Demo1 {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		int result=0;
		//mutation
		for (int string : values) {
			result=result+string*2;
		}
		System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum));
		Function<Integer,Integer> f=new Function<Integer,Integer>(){

			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
			
		};
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
	
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		
		Stream s=values.stream();
		
		Stream s1=s.map(f);
		Integer result1=(Integer)s1.reduce(0,b);
	//	System.out.println(result1);
		
	}
}
