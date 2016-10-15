import java.util.ArrayList;
import java.util.List;

public class FindNumInArray {
	
	public static void main(String[] args){
		
		String[] list = {"a", "b", "c", "d", "e"};
		int length = list.length;
		int iteration = 43;
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
		
		for (int x=0; x<length; x++){
			
			if(x+mod < length){
				numList.set(x, x+mod);
			}else{
				numList.set(x, x+mod-length);
			}
			
		}
		
		System.out.println(numList);
	}

}
