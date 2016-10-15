import java.util.ArrayList;
import java.util.List;

public class updateListValue {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("{'threshold': '0.08', 'compare':'rme', 'folder1':'', 'folder2':'', 'dpi':'200', 'path':'sksjdvbkjdbkjdfbdfbkdflbfnd', 'status':'success', 'abcd': 'fesnkjnibbs'}");
		list.add("{'threshold': '0.08', 'compare':'rme', 'folder1':'', 'folder2':'', 'dpi':'200', 'path':'sksjdvbkjdbkjvsbendjvbdkjfbjk', 'status':'failure', 'abcd': 'fesnkjnibbs'}");
		//System.out.println(list);
		
		
		modifyList(list);
		//System.out.println(list);
	} 

	public static void modifyList(List<String> list) {
		String abc = "sfsjkvbdf";
		int n = 0;
		for(String i:list){
			//String[] str = i.split(",");
			
			//abc = str[6] + abc;
			String str1 = i.substring(0, list.get(n).lastIndexOf("status")+16) +"-" +abc;
			String str2 = i.substring(list.get(n).lastIndexOf("status")+16, i.length());
			String Correct = str1 + str2;
			System.out.println(str1);
			System.out.println(str2);

			list.set(n, Correct);
			System.out.println(list);
			n++;
		}
		
		
	}
}
