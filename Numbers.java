package func;

import java.util.Arrays;
import java.util.List;

public class Numbers {
	private final List<String> arrs;
	
	Numbers(List<String> arr){
		this.arrs = arr;
	}
	
	public void map(Upper up) {
		for(int i = 0; i < arrs.size();i++){
			up.compute(Integer.parseInt(arrs.get(i)) * 4);
		}
	}
	
	public static void main(String args[]) {
		Numbers number = new Numbers(Arrays.asList("1", "2","3"));
		number.map(System.out::println);
	}
}
