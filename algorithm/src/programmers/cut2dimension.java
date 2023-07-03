package programmers;
import java.lang.Math;
class Solution45 {
	public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        int idx = 0;
        for(long i=left;i<=right;i++) {
            long x = i/n;
            long y = i%n;
            answer[idx++] = Math.max((int)x+1, (int)y+1);
        }
        return answer;
    }
}
public class cut2dimension {
	public static void main(String[] args) {
		Solution45 sol = new Solution45();
		int n = 4;
		long left = 7, right = 14;
		System.out.println("[");
		for(int i:sol.solution(n, left, right)) System.out.println(i);
		System.out.println("]");
	}
}