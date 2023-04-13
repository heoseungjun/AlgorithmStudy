package programmers;
import java.util.Collections;
import java.util.ArrayList;
class Solution23 {
	public String solution(String s) {
        String[] arr = s.split(" ");
		/*
		 * int min,max; min = max = Integer.parseInt(arr[0]);
		 * 
		 * for(int i=1;i<arr.length;i++){ int num = Integer.parseInt(arr[i]);
		 * if(min>num) min = num; if(max<num) max = num; }
		 * 
		 * String answer = String.valueOf(min)+" "+String.valueOf(max);
		 */
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++) num.add(Integer.parseInt(arr[i]));
        
        String answer = Collections.min(num)+" "+Collections.max(num);
        return answer;
    }
}
public class maxAndMin {
	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		String s = "1 2 3 4";
		System.out.println(sol.solution(s));
	}
}
