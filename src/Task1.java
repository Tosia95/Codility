// you can also use imports, for example:
import java.lang.*;
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Task1 {
	public static int solution(int[] A) {
	      int i = 0;
	      int x = 0;
	      int y = 0;
	      int s = 0;
	      int d = 0;

	        
	        while(i < A.length) {
	            
	            x = A[i];
	            y = i;
	            if (x == d){
	                i++;
	                continue;
	            }
	            i++;
	            search:
	            for(int a = i; a < A.length; a++) {
	                int b = A[a];
	                int c = a;
	                if (b == x) {
	                    d = b;
	                    A = removeElements(A, c);
	                    A = removeElements(A, y);
	                    break search;
	                } else { 
	                	s = b; 
	                	//break search;
	                }
	            }
	        }
	        return s;


	    }
    public static void main(String[] args) {
    	 int[] array = {9, 3, 9, 3, 9, 7, 9};
    	 int s = solution(array);
    	System.out.println(s);
    }
    public static int[] removeElements(int[] input, int deleteMe) {
        ArrayList <Integer> result = new ArrayList();
        
        for(Integer item : input){
            if(!(deleteMe==item))
                result.add(item);}
        int[] output =new int[result.size()];
        for (int x : result) {
        	int y = result.get(result.indexOf(x));
        	output[result.indexOf(x)] = y;
        }
        return output;
    }
    
}