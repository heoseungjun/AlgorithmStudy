package programmers;

class Solution31 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            int sum = 0;
            for(int j=i;j<=n;j++){
                sum += j;
                if(sum==n){
                    answer++;
                    break;
                }else if(sum>n) break;
            }
        }
        return answer;
    }
}
public class expressionOfNum {
	public static void main(String[] args) {
		Solution31 sol = new Solution31();
		int n = 15;
		System.out.println(n+"을 연속된 자연수의 합으로 나타낼 수 있는 경우의 수 : "+sol.solution(n));
		
	}
}