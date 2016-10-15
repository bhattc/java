package guessGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
100 4
101 5
99 3
104 4
 */
public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String,List<String>> ratingsBucket = new HashMap<String,List<String>>();
		try{
			while(scanner.hasNextLine()){
				String[] parts = scanner.nextLine().split(" ");
				if(parts == null){
				if(parts[1].equals("5")){
					if(ratingsBucket.get(parts[1]) != null){
						List<String> tmp = ratingsBucket.get(parts[1]);
						tmp.add(parts[0]);
						ratingsBucket.put(parts[1],tmp);
					}else{
						List<String> tmp = new ArrayList<String>();
						tmp.add(parts[0]);
						ratingsBucket.put(parts[1],tmp);
					}
				}else if(parts[1].equals("4")){
					if(ratingsBucket.get(parts[1]) != null){
						List<String> tmp = ratingsBucket.get(parts[1]);
						tmp.add(parts[0]);
						ratingsBucket.put(parts[1],tmp);
					}else{
						List<String> tmp = new ArrayList<String>();
						tmp.add(parts[0]);
						ratingsBucket.put(parts[1],tmp);
					}
				}else if(parts[1].equals("3")){
					if(ratingsBucket.get(parts[1]) != null){
						List<String> tmp = ratingsBucket.get(parts[1]);
						tmp.add(parts[0]);
						ratingsBucket.put(parts[1],tmp);
					}else{
						List<String> tmp = new ArrayList<String>();
						tmp.add(parts[0]);
						ratingsBucket.put(parts[1],tmp);
					}
				}else if(parts[1].equals("2")){
					if(ratingsBucket.get(parts[1]) != null){
						List<String> tmp = ratingsBucket.get(parts[1]);
						tmp.add(parts[0]);
						ratingsBucket.put(parts[1],tmp);
					}else{
						List<String> tmp = new ArrayList<String>();
						tmp.add(parts[0]);
						ratingsBucket.put(parts[1],tmp);
					}
				}else{
					if(ratingsBucket.get(parts[1]) != null){
						List<String> tmp = ratingsBucket.get(parts[1]);
						tmp.add(parts[0]);
						ratingsBucket.put(parts[1],tmp);
					}else{
						List<String> tmp = new ArrayList<String>();
						tmp.add(parts[0]);
						ratingsBucket.put(parts[1],tmp);
					}
				}
			}else{
				break;
			}
			}
			for(int i=5;i>=1;i--){
				List<String> tmp = ratingsBucket.get(i+"");
				if(tmp != null){
				for(String temp : tmp){
					System.out.println(temp+" "+tmp);
				}
				}
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		scanner.close();
	}
	
	
}	
