package programmers;
class Solution40 {
    public int solution(int n) {
        int[] fibo = new int[n+1];
        fibo[0] = 0; fibo[1] = 1;
        for(int i=2; i<=n; i++) {
            fibo[i] = (fibo[i-2] + fibo[i-1]) % 1234567;
        }
        return fibo[n];
    }
}
public class fibonacci {
	public static void main(String[] args) {
		Solution40 sol = new Solution40();
		int n = 100;
		System.out.println("n번째 피보나치수를 1234567로 나눈 나머지 : "+sol.solution(n));
	}
}