

package stream_Pract;

import java.util.Arrays;
import java.util.List;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(2,4,5,7,8,9);
		
		list.stream().filter(i -> i%2==0).forEach(System.out::print);

	}

}
