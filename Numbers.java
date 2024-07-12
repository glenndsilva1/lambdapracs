package func;

import java.util.ArrayList;
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
		List<String> k = new ArrayList<String>();
		k.add("3");
		k.add("4");
		Numbers number = new Numbers(k);
		number.map(System.out::println);
	}
}
