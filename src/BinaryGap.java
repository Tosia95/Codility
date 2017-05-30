
import java.util.*;


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class BinaryGap {
	public static int solution(int N) {
        int co = 0;
        int max = 0;
	        while (N!=0) {
	            if(N%2 == 0) {
	                co++;
	                
	                if (co > max) max = co;
	            } else co = 0;
	            N = N/2;
	        }
	        
	        return max;
	    
    }
	 //test
    public static void main(String[]args) {
    solution(1041);
    //	System.out.println(x);
    }
}
