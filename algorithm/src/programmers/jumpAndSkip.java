package programmers;

class Solution25 {
	public int solution(int n) {
        int ans = 1;
        while(n>1){
            if(n%2 == 1) ans++;
            n = n/2;
        }
        return ans;
    }
}
public class jumpAndSkip {
	public static void main(String[] args) {
		Solution25 sol = new Solution25();
		System.out.println("n�� 5�� �� ���� ȿ������ ������ ��뷮 : "+sol.solution(5));
		System.out.println("n�� 5000�� �� ���� ȿ������ ������ ��뷮 : "+sol.solution(5000));
	}
}
