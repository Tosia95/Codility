
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class BinaryGap {
	 public static int solution(int N) {
	        
	        ArrayList<Integer> binaryValues = new ArrayList<Integer>();
	        int[] array = new int[20];
	        int a = 0; 
	        int b = 0;
	        int max = 0;
	        
	        while (N != 0) {
	        int bitValue = N % 2;
	        binaryValues.add(bitValue);
	        N = N / 2;
	        }
	        for (Integer i : binaryValues) {
	            if (binaryValues.get(i) == 1) {
	                a++;
	            }
	            else  {
	                array[b] = a;
	                b++;
	                a = 0;
	                
	        }
	        }
	        
	        for (int i = 1; i < array.length; i++) {
	        
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        return max;
	    
    }
	 //test
    public static void main(String[]args) {
    	int x = solution(1041);
    	System.out.println(x);
    }
}
