import java.util.ArrayList;
import java.util.List;

public class ArrayProblem {
public static void main(String[] args){
		
		String[] list = {"a", "b", "c", "d", "e", "d", "t", "w", "u"};
		int length = list.length;
		int iteration = 6;
		int mod;
		List<Integer> numList = new ArrayList<Integer>();
		for (int i=0; i<length; i++){
			numList.add(i);
		}
		
		if(iteration > length){
			mod = iteration % length;
			
		}else{
			mod = iteration;
		}
		
		for (int x=length-1; x>=0; x--)
			
			if(x-mod < 0){
				numList.set(x, x-mod+length);
			}else{
				numList.set(x, x-mod);
			}
			
			
		
		
		System.out.println(numList);
	}
}
