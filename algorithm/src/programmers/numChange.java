package programmers;
import java.lang.Math;
class Solution37 {
    public int solution(int x, int y, int n) {
    int[] dp = new int[y + 1];
    for (int i = x; i < y + 1; i++) {
        if(i!=x && dp[i] == 0){
            dp[i] = -1; continue;
        }
        if(i*2 <= y) {
            dp[i*2] = (dp[i*2]==0) ? dp[i]+1 : Math.min(dp[i]+1, dp[i*2]);
        }
        if(i*3 <= y) {
            dp[i*3] = (dp[i*3]==0) ? dp[i]+1 : Math.min(dp[i]+1, dp[i*3]);
        }
        if(i+n <= y) {
            dp[i+n] = (dp[i+n]==0) ? dp[i]+1 : Math.min(dp[i]+1, dp[i+n]);
        }
    }
    return dp[y];
    }
}
public class numChange {
	public static void main(String[] args) {
		Solution37 sol = new Solution37();
		int x = 10, y = 40, n = 5;
		System.out.println(x+"��(��) "+y+"���� ��ȯ��Ű�� ���� �ּ� ���� Ƚ�� : "+sol.solution(x, y, n));
	}
}