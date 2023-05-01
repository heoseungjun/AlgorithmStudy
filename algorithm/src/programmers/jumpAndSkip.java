package programmers;
import java.util.*;

class Solution25 {
    public int solution(int n) {
        int ans = 0;
        while(n/2 >= 1) {
            n /= 2;
            System.out.println(n);
            ans+=1;
        }
        return ans;
    }
}
public class jumpAndSkip {
	public static void main(String[] args) {
		Solution25 sol = new Solution25();
		System.out.println("가장 효율적인 건전지 사용량 : "+sol.solution(5));
	}
}
