

class  OddOccurrencesInArray
 {
    public static int solution(int N) {
        
        int res = 0;
        int p = (int) Math.pow(11, N);
        Integer n = new Integer(p);
        String x = n.toString();
        for(int i = 1; i <= x.length(); i++) {
           if(x.substring (i -1, i).equals("1")) {
               res++;
           } 
        }
        return res;
    }
    public static void main(String[]args) {
    	int a = solution(2);
    	System.out.print(a);
    }
}
