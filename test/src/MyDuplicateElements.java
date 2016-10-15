public class MyDuplicateElements {
 
    public static int[] removeDuplicates(int[] input){
         
        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
            	System.out.println("Condition True");
                i++;
                System.out.println("value of i is : " + i);
            }else{
            	System.out.println("Condition False");
            	
            	if(i-j>1){
            		input[j+1] = input[i];
            		i++; j++;
            	}
            	else{
            		i++; j++;
            	}
            	//i++;
            	//j++;
                //input[++j] = input[i++];
                System.out.println("value of j : " +j);
                System.out.println("value of i : " +i);
            }   
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }
         
        return output;
    }
     
    public static void main(String a[]){
        int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
        int[] output = removeDuplicates(input1);
        for(int i:output){
            System.out.print(i+" ");
        }
    }
}