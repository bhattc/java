import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Palindrome {
	
	/*public static ArrayList<String> isPal(String s, ArrayList<String> res)
    {   // if length is 0 or 1 then String is palindrome
		System.out.println(s.length());
        if(s.length() == 0 || s.length() == 1){
        	System.out.println("first if");
        	res.add("yes");
        	return res;
        }
            
        if(s.charAt(0) == s.charAt(s.length()-1)){
        	System.out.println(s);
        	System.out.println(s.charAt(0));
        	System.out.println(s.charAt(s.length()-1));
        	 res.add("yes");
        	 return isPal(s.substring(1, s.length()-1), res);
        }else{
        	res.add("No");
        	return isPal(s.substring(1, s.length()-1), res);
        }
         check for first and last char of String:
         * if they are same then do the same thing for a substring
         * with first and last char removed. and carry on this
         * until you string completes or condition fails
         * Function calling itself: Recursion
         
       
        

         If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         
        
//        return res;
    }
*/	
	
//	public static boolean istPalindrom(char[] word){
//	    int i1 = 0;
//	    int i2 = word.length - 1;
//	    while (i2 > i1) {
//	        if (word[i1] != word[i2]) {
//	            return false;
//	        }
//	        ++i1;
//	        --i2;
//	    }
//	    return true;
//	}
	
	
	public static ArrayList isParenthesisMatch(String str, ArrayList<String> res) {
	    if (str.length() == 0){
	    	res.add("No");
	    	return res;
	    }
	        
	    Stack<Character> stack = new Stack<Character>();

	    char c;
	    for(int i=0; i < str.length(); i++) {
	        c = str.charAt(i);
	        stack.push(c);
	       
	    }
	    System.out.println(stack);
	    for (int j = 0; j<str.length(); j++){
	    	char d = stack.pop();
	    	if (d == str.charAt(j)){
	    		res.add("Yes");
	    	}else{
	    		res.add("No");
	    	}
	    }
//	        if(c == '(')
//	            stack.push(c);
//	        else if(c == '{')
//	            stack.push(c);
//	        else if(c == ')')
//	            if(stack.empty())
////	                return false;
//	            else if(stack.peek() == '(')
//	                stack.pop();
//	            else
////	                return false;
//	        else if(c == '}')
//	            if(stack.empty())
////	                return false;
//	            else if(stack.peek() == '{')
//	                stack.pop();
//	            else
////	                return false;
//	    }
//	    return stack.empty();
		return res;
	}
	
	public static void main(String[] arg){
		ArrayList<String> res = new ArrayList<String>();
		ArrayList<String> x = isParenthesisMatch("{}", res);
		System.out.println(x);
	}

}
