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
		System.out.println(n+"�� ���ӵ� �ڿ����� ������ ��Ÿ�� �� �ִ� ����� �� : "+sol.solution(n));
		
	}
}