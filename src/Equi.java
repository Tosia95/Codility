

import java.util.*;
import java.util.stream.*;

class Equi {
	
	public Equi(){
		int[] A = {-1,3,-4,5,1,-6,2,1};
		solution(A);
	}
    public int solution(int[] A) {
        int s = A.length;
int p =0;
int sum1 = 0;
int sum2 = 0;
for(int i = 1; i < s; i++) {
p = i;
int[] new1 = Arrays.copyOfRange(A, 0, p);
int[] new2 = Arrays.copyOfRange(A, p+1, s);

sum1 = IntStream.of(new1).sum();
sum2 = IntStream.of(new2).sum();

if (sum1 ==sum2) break;
}
System.out.println(p);
return p;

    }
    public static void main(String[]args) {
    	Equi e = new Equi();
    }
}

