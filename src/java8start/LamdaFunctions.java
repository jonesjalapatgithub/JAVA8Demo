package java8start;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaFunctions {

	public static void main(String[] args) {
		
		
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		values.forEach(i -> System.out.println(i));
		
		Consumer<Integer> c=new Consumer<Integer>()
		{

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		values.forEach(c);
		
	}
}
