package programmers;
import java.util.Arrays;
class Solution30 {
    public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A); Arrays.sort(B);
        for(int i=0,j=B.length-1;i<A.length;i++,j--) answer += A[i] * B[j];
        return answer;
    }
}
public class makeMinValue {
	public static void main(String[] args) {
		Solution30 sol = new Solution30();
		int[] A = {1,4,2};
		int[] B = {5,4,4};
		System.out.println("내가 만든 최솟값 : "+sol.solution(A,B));
	}
}
